package n2exercici1.enums;

public enum CountryEnum {

	SPAIN("Spain", "+34", "SP"),
	UK("United Kingdom", "+44", "UK");
	
	private String name;
	private String telephonePrefix;
	private String countryCode;
	
	private CountryEnum(String name, String telephonePrefix, String countryCode) {
		this.name = name;
		this.telephonePrefix = telephonePrefix;
		this.countryCode = countryCode;
	}
	
	public String getName() {
		return name;
	}

	public String getTelephonePrefix() {
		return telephonePrefix;
	}

	public String getCountryCode() {
		return countryCode;
	}
}
