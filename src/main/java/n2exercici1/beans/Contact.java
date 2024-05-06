package n2exercici1.beans;

import n2exercici1.abstracFactory.IContact;
import n2exercici1.enums.CountryEnum;
import n2exercici1.handlers.MainMenuHandler;
import n2exercici1.utils.Constants;

public class Contact implements IContact{

	private int contactId;
	private static int contactIdNext = 1;
	private String name;
	private String lastName;
	private Telephone telephone;
	private Address address;
	
	public Contact(String name, String lastName, Telephone telephone, Address address) {
		super();
		this.contactId = contactIdNext;
		Contact.contactIdNext++;
		this.name = name;
		this.lastName = lastName;
		this.telephone = telephone;
		this.address = address;
		this.telephone.printCountryTelephone();
		this.address.printAddress();
	}


	public int getContactId() {
		return contactId;
	}


	public void setContactId(int contactId) {
		this.contactId = contactId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Telephone getTelephone() {
		return telephone;
	}

	public void setTelephone(Telephone telephone) {
		this.telephone = telephone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", name=" + name + ", lastName=" + lastName + ", telephone="
				+ telephone + ", address=" + address + "]";
	}


	@Override
	public void printContactType(String country) {
		
		if(country.equalsIgnoreCase(CountryEnum.SPAIN.getName())) {
			MainMenuHandler.printText(Constants.Menus.SPAIN_TYPE);
		}else if(country.equalsIgnoreCase(CountryEnum.UK.getName())) {
			MainMenuHandler.printText(Constants.Menus.UK_TYPE);
		}
	}
}
