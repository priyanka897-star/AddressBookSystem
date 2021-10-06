package addressbooksystem;

import java.util.Set;

public class AddressBookInterface {

	void print(Set<AddressBook> contactList) {
		for (AddressBook s : contactList) {
			System.out.println(s);
		}
	}

	void edit(AddressBook contact) {
		InputScanner is4 = new InputScanner();
		System.out.println("Edit the details firstName,lastName,address,city,state,zip,phoneNumber,email respectively");
		System.out.println("Re-Correct  First Name");
		contact.setFirstName(is4.inputString());
		System.out.println("Re-Correct  Last Name");
		contact.setLastName(is4.inputString());
		System.out.println("Re-Correct  Address");
		contact.setAddress(is4.inputString());
		System.out.println("Re-Correct  City");
		contact.setCity(is4.inputString());
		System.out.println("Re-Correct  State");
		contact.setState(is4.inputString());
		System.out.println("Re-Correct  Email");
		contact.setZip(is4.inputString());
		System.out.println("Re-Correct  Zip Code");
		contact.setPhoneNumber(is4.inputString());
		System.out.println("Re-Correct  Phone Number");
		contact.setEmail(is4.inputString());
		
	}
}
