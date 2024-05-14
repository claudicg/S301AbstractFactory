package n2exercici1.enums;

public enum CountryEnum {

	SPAIN("Spain", "+34"),
	UK("United Kingdom", "+44");
	
	private String name;
	private String telephonePrefix;
	
	private CountryEnum(String name, String telephonePrefix) {
		this.name = name;
		this.telephonePrefix = telephonePrefix;
	}
	
	public String getName() {
		return name;
	}

	public String getTelephonePrefix() {
		return telephonePrefix;
	}
}
