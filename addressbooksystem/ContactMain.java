package addressbooksystem;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

public class ContactMain {

		static Dictionary dictionary = new Hashtable();
		static Hashtable<Integer, ArrayList<AddContact>> hashTable = new Hashtable<Integer, ArrayList<AddContact>>();
		Instruction instruction =new Instruction();
	        static InputScanner inputScanner = new InputScanner();

		public static void main(String[] args) {
			System.out.println("enter the address book limit");
			int addressBookLimit = inputScanner.inputInteger();
			for (int i = 1; i <= addressBookLimit; i++) {
				ArrayList<AddContact> addContactDetails = new <AddContact>ArrayList();
				while (true) {
					AddContact addPersonDetails = new AddContact();
					System.out.printf(
							"Input  01 to add Details, 02 to Edit details, 03 to delete details. \n Enter any Number  to Ignore");
					int options = inputScanner.inputInteger();
					if (options == 01 || options == 02 || options == 03 ) {
						switch (options) {
						case 01:
							addPersonDetails.setContactDetails();
							addContactDetails.add(addPersonDetails);
							break;
						case 02:
							System.out.println("Enter the name to edit");
							addPersonDetails.editDetails(addContactDetails);
							break;
						case 03:
							addPersonDetails.deleteDetails(addContactDetails);
							break;
						default:
							System.out.println("you have not perform any operation");
							break;
						}

					} else {
						System.out.println("Details are uptodate");
						break;
					}
				}
				hashTable.put(i, addContactDetails);
			}
			for(int i=1; i<= hashTable.size(); i++) {
				System.out.println("address book "+i);
				System.out.println(hashTable.get(i));	
			}		
		}
}
