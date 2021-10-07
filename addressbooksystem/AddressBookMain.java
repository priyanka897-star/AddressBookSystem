package addressbooksystem;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book System");

		AddressBook contact = new AddressBook();
		System.out.println("Enter Following Contact Details");

		InputScanner inputScanner = new InputScanner();
		Instruction instuction = new Instruction();
		instuction.EnterFirstName();
		contact.setFirstName(inputScanner.inputString());
		instuction.EnterLastName();
		contact.setLastName(inputScanner.inputString());
		instuction.EnterAddress();
		contact.setAddress(inputScanner.inputString());
		instuction.EnterCity();
		contact.setCity(inputScanner.inputString());
		instuction.EnterState();
		contact.setState(inputScanner.inputString());
		instuction.EnterEmail();
		contact.setEmail(inputScanner.inputString());
		instuction.EnterZip();
		contact.setZip(inputScanner.inputString());
		instuction.EnterPhoneNumber();
		contact.setPhoneNumber(inputScanner.inputString());

		AddressBook1 personContact = new AddressBook1();
		System.out.println("Enter Following  Person Contact Details");
		instuction.EnterFirstName();
		personContact.setFirstName(inputScanner.inputString());
		instuction.EnterLastName();
		personContact.setLastName(inputScanner.inputString());
		instuction.EnterAddress();
		personContact.setAddress(inputScanner.inputString());
		instuction.EnterCity();
		personContact.setCity(inputScanner.inputString());
		instuction.EnterState();
		personContact.setState(inputScanner.inputString());
		instuction.EnterEmail();
		personContact.setEmail(inputScanner.inputString());
		instuction.EnterZip();
		personContact.setZip(inputScanner.inputString());
		instuction.EnterPhoneNumber();
		personContact.setPhoneNumber(inputScanner.inputString());

		AddressBook personContact1 = new AddressBook();
		System.out.println("Enter Following  Person 1 Contact Details");
		instuction.EnterFirstName();
		personContact1.setFirstName(inputScanner.inputString());
		instuction.EnterLastName();
		personContact1.setLastName(inputScanner.inputString());
		instuction.EnterAddress();
		personContact1.setAddress(inputScanner.inputString());
		instuction.EnterCity();
		personContact1.setCity(inputScanner.inputString());
		instuction.EnterState();
		personContact1.setState(inputScanner.inputString());
		instuction.EnterEmail();
		personContact1.setEmail(inputScanner.inputString());
		instuction.EnterZip();
		personContact1.setZip(inputScanner.inputString());
		instuction.EnterPhoneNumber();
		personContact1.setPhoneNumber(inputScanner.inputString());

		AddressBookStore addressBookStore = new AddressBookStore();
		addressBookStore.Add(contact);
		addressBookStore.Add(personContact);
		// addressBookStore.Add(personContact1);

		AddressBookInterface addressBookInterface = new AddressBookInterface();
		addressBookInterface.print(addressBookStore.getContactList());
		
		AddressBookInterface addressBookInterface1 = new AddressBookInterface();
		addressBookInterface1.print1(addressBookStore.getContactList1());
		


		int choice;
		System.out.println("Enter choice 1.Add the new contact\n 2.Edit Existing contact 3.Remove the contact");
		choice = inputScanner.inputInteger();

		switch (choice) {
		case 1:
			System.out.println("select option 5 to add details to AddressBook and option 6 to add to AddressBookTwo");
			int option;
			option = inputScanner.inputInteger();
			switch(option) {
		    case 5:
		    	//AddressBook contact = new AddressBook();
		    	addressBookInterface.addContact(contact);
		    	addressBookStore.Add(contact);
				System.out.println("Contact List after add");
				addressBookInterface.print(addressBookStore.getContactList());
				addressBookInterface1.print1(addressBookStore.getContactList1());
		    break;	
		    case 6:
		    	//AddressBookTwo contact = new AddressBookTwo();
		    	addressBookInterface.addContact(contact);
		    	addressBookStore.Add(contact);
				System.out.println("Contact List after add");
				addressBookInterface.print(addressBookStore.getContactList());
				addressBookInterface1.print1(addressBookStore.getContactList1());
			break;
			}
//			System.out.println("Enter how many persons you want to add");
//			
//				// AddressBook contact = new AddressBook();
//				addressBookInterface.addContact(contact);
//				addressBookStore.Add(contact);
//				System.out.println("Contact List after add");
//				addressBookInterface.print(addressBookStore.getContactList());
//			}
	
	 case 2:
		    
		
			System.out.println("Enter name of contact you want to edit");
			String name = inputScanner.inputString();
			if (contact.getFirstName().equalsIgnoreCase(name) == true)
				addressBookInterface.edit(contact);
			else if (personContact.getFirstName().equalsIgnoreCase(name) == true)
				addressBookInterface.edit(personContact);
			System.out.println("Contact List after edit");
			addressBookInterface.print(addressBookStore.getContactList());
			addressBookInterface1.print1(addressBookStore.getContactList1());
			break;

//			System.out.println("Enter name of contact you want to edit");
//			String name = inputScanner.inputString();
//			if (contact.getFirstName().equalsIgnoreCase(name) == true)
//				addressBookInterface.edit(contact);
//			else if (personContact.getFirstName().equalsIgnoreCase(name) == true)
//				addressBookInterface.edit(personContact);
//			System.out.println("Contact List after edit");
//			addressBookInterface.print(addressBookStore.getContactList());
//			break;

		case 3:
			
			System.out.println("Enter name of contact you want to edit");
			String firstName = inputScanner.inputString();
			if (contact.getFirstName().equalsIgnoreCase(firstName) == true)
				addressBookStore.remove(contact);
			else if (personContact.getFirstName().equalsIgnoreCase(firstName) == true)
				addressBookStore.remove(personContact);
			System.out.println("Contact List after edit");
			addressBookInterface.print(addressBookStore.getContactList());
			addressBookInterface1.print1(addressBookStore.getContactList1());
			break;

//			System.out.println("Enter name of person you want to delete");
//			String personFirstName = inputScanner.inputString();
//			if (contact.getFirstName().equalsIgnoreCase(personFirstName) == true)
//				addressBookStore.remove(contact);
//			else if (personContact.getFirstName().equalsIgnoreCase(personFirstName) == true)
//				addressBookStore.remove(personContact);
//			System.out.println("Contact List after deletion");
//			addressBookInterface.print(addressBookStore.getContactList());
			
		}

 }
}