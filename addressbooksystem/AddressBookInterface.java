package addressbooksystem;

import java.util.Set;

public class AddressBookInterface {

	void print(Set<AddressBook> contactList) {
		for (AddressBook s : contactList) {
			System.out.println(s);
		}
	}
	
	void print1(Set<AddressBook1> contactList1) {
		for (AddressBook1 m : contactList1) {
			System.out.println(m);
		}
	}
	
	public void edit(AddressBook contact) {
		InputScanner inputScanner = new InputScanner();
		System.out.println("Edit the details firstName,lastName,address,city,state,zip,phoneNumber,email respectively");
		System.out.println("Re-Correct  First Name");
		contact.setFirstName(inputScanner.inputString());
		System.out.println("Re-Correct  Last Name");
		contact.setLastName(inputScanner.inputString());
		System.out.println("Re-Correct  Address");
		contact.setAddress(inputScanner.inputString());
		System.out.println("Re-Correct  City");
		contact.setCity(inputScanner.inputString());
		System.out.println("Re-Correct  State");
		contact.setState(inputScanner.inputString());
		System.out.println("Re-Correct  Email");
		contact.setZip(inputScanner.inputString());
		System.out.println("Re-Correct  Zip Code");
		contact.setPhoneNumber(inputScanner.inputString());
		System.out.println("Re-Correct  Phone Number");
		contact.setEmail(inputScanner.inputString());

	}

	void addContact(AddressBook personContact) {

		InputScanner inputScanner = new InputScanner();
		Instruction instruction = new Instruction();
		System.out.println("Enter  person contact details ");
		instruction.EnterFirstName();
		personContact.setFirstName(inputScanner.inputString());
		instruction.EnterLastName();
		personContact.setLastName(inputScanner.inputString());
		instruction.EnterAddress();
		personContact.setAddress(inputScanner.inputString());
		instruction.EnterCity();
		personContact.setCity(inputScanner.inputString());
		instruction.EnterState();
		personContact.setState(inputScanner.inputString());
		instruction.EnterEmail();
		personContact.setEmail(inputScanner.inputString());
		instruction.EnterZip();
		personContact.setZip(inputScanner.inputString());
		instruction.EnterPhoneNumber();
		personContact.setPhoneNumber(inputScanner.inputString());
	}
	public void edit(AddressBook1 contact) {
		InputScanner inputScanner = new InputScanner();
		System.out.println("Edit the details firstName,lastName,address,city,state,zip,phoneNumber,email respectively");
		System.out.println("Re-Correct  First Name");
		contact.setFirstName(inputScanner.inputString());
		System.out.println("Re-Correct  Last Name");
		contact.setLastName(inputScanner.inputString());
		System.out.println("Re-Correct  Address");
		contact.setAddress(inputScanner.inputString());
		System.out.println("Re-Correct  City");
		contact.setCity(inputScanner.inputString());
		System.out.println("Re-Correct  State");
		contact.setState(inputScanner.inputString());
		System.out.println("Re-Correct  Email");
		contact.setZip(inputScanner.inputString());
		System.out.println("Re-Correct  Zip Code");
		contact.setPhoneNumber(inputScanner.inputString());
		System.out.println("Re-Correct  Phone Number");
		contact.setEmail(inputScanner.inputString());

	}
	void addContact(AddressBook1 personContact) {
		InputScanner inputScanner = new InputScanner();
		Instruction instruction = new Instruction();
		System.out.println("Enter  person contact details ");
		instruction.EnterFirstName();
		personContact.setFirstName(inputScanner.inputString());
		instruction.EnterLastName();
		personContact.setLastName(inputScanner.inputString());
		instruction.EnterAddress();
		personContact.setAddress(inputScanner.inputString());
		instruction.EnterCity();
		personContact.setCity(inputScanner.inputString());
		instruction.EnterState();
		personContact.setState(inputScanner.inputString());
		instruction.EnterEmail();
		personContact.setEmail(inputScanner.inputString());
		instruction.EnterZip();
		personContact.setZip(inputScanner.inputString());
		instruction.EnterPhoneNumber();
		personContact.setPhoneNumber(inputScanner.inputString());
	}

}
