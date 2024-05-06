package n2exercici1.abstracFactory;

public abstract class ContactAbstracFactory {

	public abstract IContact createContact(String name, 
										   String lastName, 
										   String telephone,
										   String roadType, 
										   String roadName, 
										   String doorNumber, 
										   String floor, 
										   String door, 
										   String city, 
										   String postCode);
}
