package addressbooksystem;

import java.util.HashSet;
import java.util.Set;

public class AddressBookStore {

	public Set<AddressBook> contactList = new HashSet();
	public Set<AddressBook1> contactList1 = new HashSet();
	

	public Set<AddressBook> getContactList() {
		return contactList;
	}

	void Add(AddressBook contact) {
		contactList.add(contact);

	}

	public void remove(AddressBook contact) {
		contactList.remove(contact);
	}
	
	public Set<AddressBook1> getContactList1() {
		return contactList1;
	}

	void Add(AddressBook1 contact) {
		contactList1.add(contact);

	}

	public void remove(AddressBook1 contact) {
		contactList1.remove(contact);
	}
	
	
}
