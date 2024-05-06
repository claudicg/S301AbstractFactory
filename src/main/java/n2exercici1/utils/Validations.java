package n2exercici1.utils;

import n2exercici1.enums.CountryEnum;
import n2exercici1.enums.RoadTypeEnum;

public class Validations {

	public static boolean isValidMenuOption(String option) {
		return option.matches("^[0-1]{1}$");
	}
	
	public static boolean isValidCountry(String country) {	
		return country.equalsIgnoreCase(CountryEnum.SPAIN.getName()) 
			|| country.equalsIgnoreCase(CountryEnum.UK.getName());	
	}
	
	public static boolean isValidName(String name) {
		return name.matches("^[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ\\s]+$");
	}
	
	public static boolean isValidTelephone(String telephone, String country) {
		
		if(country.equalsIgnoreCase(CountryEnum.SPAIN.getName())) {
			return telephone.matches("^(6|9){1}[0-9]{8}$");
		}else if(country.equalsIgnoreCase(CountryEnum.UK.getName())) {
			return telephone.matches("^(3|5|7){1}[0-9]{9}$");
		}else {
			return false;
		}
	}
	
	public static boolean isValidRoadType(String roadType, String country) {
		
		if(country.equalsIgnoreCase(CountryEnum.SPAIN.getName())) {
			return roadType.equalsIgnoreCase(RoadTypeEnum.STREET.getSpanishName())
					|| roadType.equalsIgnoreCase(RoadTypeEnum.AVENUE.getSpanishName())
				    || roadType.equalsIgnoreCase(RoadTypeEnum.PASSAGE.getSpanishName())
				    || roadType.equalsIgnoreCase(RoadTypeEnum.PROMENADE.getSpanishName())
				    || roadType.equalsIgnoreCase(RoadTypeEnum.SQUARE.getSpanishName());
		}else if(country.equalsIgnoreCase(CountryEnum.UK.getName())) {
			return roadType.equalsIgnoreCase(RoadTypeEnum.STREET.getEnglishName())
					|| roadType.equalsIgnoreCase(RoadTypeEnum.AVENUE.getEnglishName())
				    || roadType.equalsIgnoreCase(RoadTypeEnum.PASSAGE.getEnglishName())
				    || roadType.equalsIgnoreCase(RoadTypeEnum.PROMENADE.getEnglishName())
				    || roadType.equalsIgnoreCase(RoadTypeEnum.SQUARE.getEnglishName());
		}else {
			return false;
		}
	}
	
	//200, 220B, 2bis, A2.
	public static boolean isValidDoorNumber(String doorNumber) {
		return doorNumber.matches("^[a-zA-Z0-9áéíóúÁÉÍÓÚüÜñÑ]+$");	
	}
	
	public static boolean isValidPostalCode(String country, String postCode) {
		
		return postCode.matches("^[a-zA-Z0-9\\s]+$");
	}
	
}
