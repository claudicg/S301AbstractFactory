package n2exercici1.handlers;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import n2exercici1.utils.Validations;

public class MainMenuHandler {

	private static Logger logger = LoggerFactory.getLogger(MainMenuHandler.class);
	
	private static Scanner scanner;
	

	public MainMenuHandler() {
		super();
		scanner = new Scanner(System.in);
	}
	
	
	public void runMainMenu() {
		
		logger.info("MainMenuHandler :: runMainMenu :: show MainMenu.");
		String menuOption = "";
		
		do {
			
			printText(MenuMessageHandler.getMainMenu());
			
			do {
				
				printText(MenuMessageHandler.getEnterValidOption());
				menuOption = readConsoleInput().trim();
				
			} while(!Validations.isValidMenuOption(menuOption));
			
			processMainMenuOption(menuOption);
			
		} while(!menuOption.equalsIgnoreCase("0"));

		closeConsoleInput();
		
	}
	
	private static void processMainMenuOption(String menuOption) {
		
		switch(menuOption) {
			case "1":
				CreateContactHandler.runCreateContact();
				break;
			case "0":
				runExitAddressBook();
				break;
			default:
				break;
		}
	}
	
	private static void runExitAddressBook() {
		
		logger.info("MainMenuHandler :: runExitAddressBook :: Address Book App is closing...");
		printText(MenuMessageHandler.getExitMessage());
	}
	
	
	public static String readConsoleInput() {
		return scanner.nextLine();
	}
	
	public static void closeConsoleInput() {
		scanner.close();
	}
	
	public static void printText(String text) {
		System.out.println(text);
	}
}
