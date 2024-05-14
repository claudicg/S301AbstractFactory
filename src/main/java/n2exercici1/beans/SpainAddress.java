package n2exercici1.beans;

import n2exercici1.enums.CountryEnum;

public class SpainAddress extends Address{

	private String postCode;
	private final String country;
	
	public SpainAddress(String roadType, String roadName, String doorNumber, String floor, String door, String city,
		String postCode) {
		super(roadType, roadName, doorNumber, floor, door, city);
		this.postCode = postCode;
		this.country = CountryEnum.SPAIN.getName().toUpperCase();
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	
	
	@Override
	public String formatAddress(String roadType ) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("\n\n" + super.getRoadType() + " " + super.getRoadName() + " " + super.getDoorNumber() + " " + super.getFloor()+ " " + super.getDoor() + "\n");
		sb.append(this.postCode + " " + super.getCity() + "\n");
		sb.append(this.country + "\n\n");
		return sb.toString();
	}

	@Override
	public void printAddress() {
		
		System.out.println(formatAddress(super.getRoadType()));
	}

	@Override
	public String toString() {
		return "SpainAddress [postCode=" + postCode + ", country=" + country + "]";
	}
		
}
