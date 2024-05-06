package n2exercici1.abstracFactory;

import n2exercici1.beans.Address;
import n2exercici1.beans.Contact;
import n2exercici1.beans.Telephone;
import n2exercici1.beans.UKAddress;
import n2exercici1.beans.UKTelephone;

public class UKContactFactory extends ContactAbstracFactory{

	@Override
	public IContact createContact(String name, 
								   String lastName, 
								   String telephone,
								   String roadType, 
								   String roadName, 
								   String doorNumber, 
								   String floor, 
								   String door, 
								   String city, 
								   String postCode) {
		
		Telephone phone = new UKTelephone(telephone);
		Address ads = new UKAddress(roadType, roadName, doorNumber, floor, door, city, postCode);
		IContact contact = new Contact(name, lastName, phone, ads);
		return contact;
	}
}
