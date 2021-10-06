package addressbooksystem;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book System");

		AddressBook contact = new AddressBook();
		System.out.println("Enter Following Contact Details");
		InputScanner is = new InputScanner();

		System.out.println("Enter First Name:");
		String contactFirstName = is.inputString();
		contact.setFirstName(contactFirstName);

		System.out.println("Enter Last Name:");
		String contactLastName = is.inputString();
		contact.setLastName(contactLastName);
		
		System.out.println("Enter Address:");
		String contactAddress = is.inputString();
		contact.setAddress(contactAddress);

		System.out.println("Enter City:");
		String contactCity = is.inputString();
		contact.setCity(contactCity);

		System.out.println("Enter State:");
		String contactState = is.inputString();
		contact.setState(contactState);

		System.out.println("Enter Email:");
		String contactEmail = is.inputString();
		contact.setEmail(contactEmail);

		System.out.println("Enter Zip: ");
		String contactZip = is.inputString();
		contact.setZip(contactZip);

		System.out.println("Enter Phone Number: ");
		String contactPhoneNumber = is.inputString();
		contact.setPhoneNumber(contactPhoneNumber);
		
		AddressBook  personContact = new  AddressBook();
		System.out.println("Enter Following  Person Contact Details");
		InputScanner is1 = new InputScanner();
		System.out.println("Enter First Name:");
		personContact.setFirstName(is1.inputString());
		System.out.println("Enter Last Name:");
		personContact.setLastName(is1.inputString());
		System.out.println("Enter Address:");
		personContact.setAddress(is1.inputString());
		System.out.println("Enter City:");
		personContact.setCity(is1.inputString());
		System.out.println("Enter State:");
		personContact.setState(is1.inputString());
		System.out.println("Enter Email:");
		personContact.setEmail(is1.inputString());
		System.out.println("Enter Zip Code:");
		personContact.setZip(is1.inputString());
		System.out.println("Enter  Phone Number");
		personContact.setPhoneNumber(is1.inputString());
		
		AddressBook  personContact1 = new  AddressBook();
		System.out.println("Enter Following  Person 1 Contact Details");
		InputScanner is2 = new InputScanner();
		System.out.println("Enter First Name:");
		personContact1.setFirstName(is2.inputString());
		System.out.println("Enter Last Name:");
		personContact1.setLastName(is2.inputString());
		System.out.println("Enter Address:");
		personContact1.setAddress(is2.inputString());
		System.out.println("Enter City:");
		personContact1.setCity(is2.inputString());
		System.out.println("Enter State:");
		personContact1.setState(is2.inputString());
		System.out.println("Enter Email:");
		personContact1.setEmail(is2.inputString());
		System.out.println("Enter Zip Code:");
		personContact1.setZip(is2.inputString());
		System.out.println("Enter  Phone Number");
		personContact1.setPhoneNumber(is1.inputString());
		
		AddressBookStore addressBookStore = new AddressBookStore();
                addressBookStore.Add(contact);
                addressBookStore.Add(personContact);
                addressBookStore.Add(personContact1);
        
		AddressBookInterface addressBookInterface = new AddressBookInterface();
		addressBookInterface.print(addressBookStore.getContactList());
		
		InputScanner is3 = new InputScanner();
		System.out.println("Enter name of contact you want to edit");
		String name = is3.inputString();
		if(contact.getFirstName().equalsIgnoreCase(name) == true)
			addressBookInterface.edit(contact);
		else if(personContact.getFirstName().equalsIgnoreCase(name) == true)
			addressBookInterface.edit(personContact);
		else if(personContact1.getFirstName().equalsIgnoreCase(name) == true)
			addressBookInterface.edit(personContact1);
		System.out.println("Contact List after edit");
		addressBookInterface.print(addressBookStore.getContactList());
		
		InputScanner is6 = new InputScanner();
		System.out.println("Enter name of contact you want to delete");
		String contactName = is6.inputString();
		if(contact.getFirstName().equalsIgnoreCase(contactName) == true)
			addressBookStore .remove(contact);
		else if(personContact.getFirstName().equalsIgnoreCase(contactName) == true)
			addressBookStore.remove(personContact);
		else if(personContact1.getFirstName().equalsIgnoreCase(contactName) == true)
			addressBookStore.remove(personContact1);
		System.out.println("Contact List after deletion");
		addressBookInterface.print(addressBookStore.getContactList());
		
		is.scannerClose();
	        is1.scannerClose();
		is2.scannerClose();
		is3.scannerClose();
		is6.scannerClose();
	}
}
