package n2exercici1.handlers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import n2exercici1.abstracFactory.ContactManager;
import n2exercici1.beans.Contact;
import n2exercici1.singleton.AddressBookSingleton;
import n2exercici1.utils.Validations;


public class CreateContactHandler {

	private static Logger logger = LoggerFactory.getLogger(CreateContactHandler.class);
	
	public static void runCreateContact() {
		
		String country = askCountry();
		String name = askName();
		String lastName = askLastName();
		String telephone = askTelephoneNumber(country);
		String roadType = askRoadType(country);
		String roadName = askRoadName();
		String doorNumber = askDoorNumber();
		String floor = askFloor();
		String door = askDoor();
		String city = askCity();
		String postCode = askPostCode(country);
		
		
		printName(name, lastName);
		Contact contact = (Contact) ContactManager.createContactByCountry(name, lastName , telephone, roadType, roadName,
				doorNumber, floor, door, city, postCode, country);
		
		logger.info("CreateContactHandler :: runCreateContact :: new contact created.");
		
		AddressBookSingleton.getAddressBookSingleton().getContacts().add(contact);
		
		logger.info("CreateContactHandler :: runCreateContact :: new contact added to contact list.");
	}
	
	
	private static String askCountry() {
		
		String country = "";
		do {
			MainMenuHandler.printText(MenuMessageHandler.getValidCountry());
			country = MainMenuHandler.readConsoleInput().trim();	
		}while(!Validations.isValidCountry(country));
		return country;
	}
	
	
	private static String askName() {
		
		String contactName = "";
		
		do {
			MainMenuHandler.printText(MenuMessageHandler.getValidName());
			contactName = MainMenuHandler.readConsoleInput().trim();	
		}while(!Validations.isValidName(contactName));
		
		return contactName;
	}
	
	private static String askLastName() {
		
		String contactLastName = "";
		
		do {
			MainMenuHandler.printText(MenuMessageHandler.getValidLastName());
			contactLastName = MainMenuHandler.readConsoleInput().trim();	
		}while(!Validations.isValidName(contactLastName));
		
		return contactLastName;
	}
	
	private static String askTelephoneNumber(String country) {
		
		String telephone = "";
		do {
			MainMenuHandler.printText(MenuMessageHandler.getValidTelephone());
			telephone = MainMenuHandler.readConsoleInput();	
			telephone = telephone.replace(" ", "").trim();
		}while(!Validations.isValidTelephone(telephone, country));
		return telephone;
	}
	
	private static String askRoadType(String country) {
		
		String roadType = "";
		do {
			MainMenuHandler.printText(MenuMessageHandler.getValidRoadTpe());
			roadType = MainMenuHandler.readConsoleInput().trim();	
		}while(!Validations.isValidRoadType(roadType, country));
		return roadType;
	}
	
	private static String askRoadName() {
		
		String roadName = "";
		do {
			MainMenuHandler.printText(MenuMessageHandler.getValidRoadName());
			roadName = MainMenuHandler.readConsoleInput().trim();	
		}while(!Validations.isValidName(roadName));
		return roadName;
	}
	
	private static String askDoorNumber() {
		
		String doorNumber = "";
		do {
			MainMenuHandler.printText(MenuMessageHandler.getValidDoorNumber());
			doorNumber = MainMenuHandler.readConsoleInput().trim();	
		}while(!Validations.isValidDoorNumber(doorNumber));
		return doorNumber;
	}
	
	
	private static String askFloor() {
		
		String floor = "";
		do {
			MainMenuHandler.printText(MenuMessageHandler.getValidFloor());
			floor = MainMenuHandler.readConsoleInput();	
		}while(!Validations.isValidDoorNumber(floor));
		return floor;
	}
	
	private static String askDoor() {
		
		String door = "";
		do {
			MainMenuHandler.printText(MenuMessageHandler.getValidDoor());
			door = MainMenuHandler.readConsoleInput();	
		}while(!Validations.isValidDoorNumber(door));
		return door;
	}
	
	private static String askCity() {
		
		String city = "";
		do {
			MainMenuHandler.printText(MenuMessageHandler.getValidCity());
			city = MainMenuHandler.readConsoleInput();	
		}while(!Validations.isValidName(city));
		return city;
	}
	
	private static String askPostCode(String country) {
		
		String postcode = "";
		do {
			MainMenuHandler.printText(MenuMessageHandler.getValidPostCode());
			postcode = MainMenuHandler.readConsoleInput();	
		}while(!Validations.isValidPostalCode(postcode, country));
		return postcode;
	}
	
	private static void printName(String name, String lastName) {
		
		MainMenuHandler.printText(name + " " + lastName);
		
	}
}
