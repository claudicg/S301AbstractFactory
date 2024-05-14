package n2exercici1.abstracFactory;

import n2exercici1.beans.Contact;

public interface  IContact {

	 Contact createContact(String name, 
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
