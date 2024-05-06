package n2exercici1.beans;

import n2exercici1.enums.CountryEnum;
import n2exercici1.handlers.MainMenuHandler;

public class UKAddress extends Address{

	private String postCode;
	private final String country;
	
	public UKAddress(String roadType, String roadName, String doorNumber, String floor, String door, String cyty,
			String postCode) {
		super(roadType, roadName, doorNumber, floor, door, cyty);
		this.postCode = postCode;
		this.country = CountryEnum.UK.getName().toUpperCase();
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	@Override
	public String formatAddress(String typeRoad) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("\n\n" + super.getFloor() + " " + super.getDoor() + ".\n");
		sb.append(super.getDoorNumber() + " " + super.getRoadName() + " " + super.getRoadType()+ ".\n");
		sb.append(super.getCity()+ "\n");
		sb.append(this.postCode + "\n\n");
		sb.append(this.country);
		return sb.toString();
	}

	@Override
	public void printAddress() {
		
		MainMenuHandler.printText(formatAddress(super.getRoadType()));
		
	}
}
