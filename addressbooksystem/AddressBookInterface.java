package addressbooksystem;

import java.util.Set;

public class AddressBookInterface {

		void print(Set<AddressBook> contactList) {
			for (AddressBook s : contactList) {
				System.out.println(s);
			}
		}
}

