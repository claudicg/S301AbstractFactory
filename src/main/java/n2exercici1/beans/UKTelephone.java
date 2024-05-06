package n2exercici1.beans;

import n2exercici1.enums.CountryEnum;

public class UKTelephone extends Telephone{

	private final String prefix;
	
	public UKTelephone(String telephone) {
		super(telephone);
		this.prefix = CountryEnum.UK.getTelephonePrefix();
	}

	@Override
	public void printCountryTelephone() {
		
		System.out.println(this.prefix + super.telephone);
		
	}

	@Override
	public String toString() {
		return "UKTelephone [prefix=" + prefix + "]";
	}
	
}
