package n2exercici1.beans;

public abstract class Address {

	protected String roadType;	
	protected String roadName;
	protected String doorNumber;
	protected String floor;
	protected String door;
	protected String city;
	
	public Address(String roadType, String roadName, String doorNumber, String floor, String door,
			String city) {
		super();
		this.roadType = roadType;
		this.roadName = roadName;
		this.doorNumber = doorNumber;
		this.floor = floor;
		this.door = door;
		this.city = city.toUpperCase();
	}
	

	public String getRoadType() {
		return roadType;
	}
	
	public void setRoadType(String roadType) {
		this.roadType = roadType;
	}

	public String getRoadName() {
		return roadName;
	}

	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}

	public String getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getDoor() {
		return door;
	}

	public void setDoor(String door) {
		this.door = door;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public abstract String formatAddress(String typeRoad);

	public abstract void printAddress();


	@Override
	public String toString() {
		return "Address [roadType=" + roadType + ", roadName=" + roadName + ", doorNumber=" + doorNumber + ", floor="
				+ floor + ", door=" + door + ", city=" + city + "]";
	}	
}
