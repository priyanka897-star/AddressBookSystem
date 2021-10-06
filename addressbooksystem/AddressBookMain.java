package addressbooksystem;

//import com.bl.aquarium.AddressBookStore;
//import com.bl.aquarium.AddressBookInterface;

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
		is.scannerClose();
		
		AddressBook  personContact = new  AddressBook();
		
		personContact.setFirstName("sachi");
		personContact.setLastName("More");
		personContact.setAddress("fort,Mumbai");
		personContact.setCity("Mumbai");
		personContact.setState("Maharashtra");
		personContact.setEmail("sachimore123@gmail.com");
		personContact.setZip("415406");
		personContact.setPhoneNumber("8612458576");
		is.scannerClose();

		AddressBookStore addressBookStore = new AddressBookStore();
        addressBookStore.Add(contact);
        addressBookStore.Add(personContact);
         
		 AddressBookInterface addressBookInterface = new AddressBookInterface();
		 addressBookInterface.print(addressBookStore.getContactList());

	}
}
