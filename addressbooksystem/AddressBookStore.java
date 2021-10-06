package addressbooksystem;

import java.util.HashSet;
import java.util.Set;

public class AddressBookStore {

	public Set<AddressBook> contactList = new HashSet();

	// public ArrayList<Object> getFishList() {
	public Set<AddressBook> getContactList() {
		// TODO Auto-generated method stub
		return contactList;
	}

	void Add(AddressBook addressBook) {
		contactList.add(addressBook);
	}
}
