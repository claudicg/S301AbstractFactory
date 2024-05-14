package n2exercici1.abstracFactory;

import n2exercici1.enums.CountryEnum;

public class ContactManager {

	public static IContact createContactByCountry(String name, String lastName, String telephone,
			String roadType, String roadName, String doorNumber, String floor, String door,
			String city, String postCode, String country) {
		
		if(country.equalsIgnoreCase(CountryEnum.SPAIN.getName())) {
			SpainContactFactory spainFactory = new SpainContactFactory();
			IContact contact = spainFactory.createContact(name, lastName, telephone, roadType,
					roadName, doorNumber, floor, door, city, postCode);
			
			return contact;
		}else if(country.equalsIgnoreCase(CountryEnum.UK.getName())) {
			UKContactFactory ukFactory = new UKContactFactory();
			IContact contact = ukFactory.createContact(name, lastName, telephone, roadType, roadName,
					doorNumber, floor, door, city, postCode);
			
			return contact;
		}
		return null;
		
	}
}
