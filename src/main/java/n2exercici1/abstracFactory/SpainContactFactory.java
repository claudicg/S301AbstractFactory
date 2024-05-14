package n2exercici1.abstracFactory;

import n2exercici1.beans.Address;
import n2exercici1.beans.Contact;
import n2exercici1.beans.SpainAddress;
import n2exercici1.beans.SpainTelephone;
import n2exercici1.beans.Telephone;

public class SpainContactFactory implements IContact{

	@Override
	public Contact createContact(String name, 
								   String lastName, 
								   String telephone,
								   String roadType, 
								   String roadName, 
								   String doorNumber, 
								   String floor, 
								   String door, 
								   String city, 
								   String postCode) {
	
		Telephone phone = new SpainTelephone(telephone);
		Address ads = new SpainAddress(roadType, roadName, doorNumber, floor, door, city, postCode);
		Contact contact = new Contact(name, lastName, phone, ads);
		return contact;
	}
}
