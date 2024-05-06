package n2exercici1.singleton;

import java.util.ArrayList;
import java.util.List;

import n2exercici1.beans.Contact;


public class AddressBookSingleton {
	
	private static AddressBookSingleton addressBookSingleton;
	
	private List<Contact> contacts;
	
	private AddressBookSingleton() {
		super();
		this.contacts = new ArrayList<>();
		
	}
	
	
	public static AddressBookSingleton getAddressBookSingleton() {
		if(addressBookSingleton == null) {
			addressBookSingleton = new AddressBookSingleton();
		}
		return addressBookSingleton;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		return "AddressBookSingleton [contacts=" + contacts + "]";
	}

}
