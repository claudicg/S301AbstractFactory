package n2exercici1.beans;

import n2exercici1.enums.CountryEnum;
import n2exercici1.handlers.MainMenuHandler;

public class SpainTelephone extends Telephone{

	private final String prefix;
	
	public SpainTelephone(String telephone) {
		super(telephone);
		this.prefix = CountryEnum.SPAIN.getTelephonePrefix();
	}

	@Override
	public void printCountryTelephone() {
		
		MainMenuHandler.printText(this.prefix + super.telephone);
		
	}

	@Override
	public String toString() {
		return "SpainTelephone [prefix=" + prefix + "]";
	}	
}
