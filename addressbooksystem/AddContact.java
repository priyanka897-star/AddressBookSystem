package addressbooksystem;


import java.util.ArrayList;
import java.util.Scanner;

public class AddContact extends PersonDetails {
		
         InputScanner inputScanner = new InputScanner();
	public void setContactDetails()  {
			System.out.println("enter the First Name");
			setFirstName(inputScanner.inputString() );
			System.out.println("enter the Last Name");
			setLastName(inputScanner.inputString());
			System.out.println("enter the Address Name");
			setAddress(inputScanner.inputString());
			System.out.println("enter the State Name");
			setState(inputScanner.inputString());
			System.out.println("enter the Phone Number");
			setPhoneNumber(inputScanner.inputString());
			System.out.println("enter the Zip/postal Code");
			setZip(inputScanner.inputString());
			System.out.println("enter the Email");
			setEmail(inputScanner.inputString());
		}

		public void getContactDetails() {
			getFirstName();
			getLastName();
			getAddress();
			getState();
			getPhoneNumber();
			getZip();
			getEmail();
		}

		public void editDetails(ArrayList<AddContact> contatctDetails) {
			String name = inputScanner.inputString();
			System.out.println(contatctDetails.size());
			for (int i = 0; i < contatctDetails.size(); i++) {
				if (contatctDetails.get(i).getFirstName().equals(name)) {
					System.out.printf("enter the number to update contact details 1 First Name 2 to update Last Name 3 to phone number 4 to pincode 5 to address 6 to email 7 to state");
					int updateChoice =  inputScanner.inputInteger();
					inputScanner.inputInteger();
					
					switch (updateChoice) {
					case 1:
						System.out.println("enter the name to update");
						String fName = inputScanner.inputString();
						contatctDetails.get(i).setFirstName(fName);
						break;
					case 2:
						System.out.println("enter the Last name to update");
						String lName = inputScanner.inputString();
						contatctDetails.get(i).setLastName(lName);
						break;
					case 3:
						System.out.println("enter the Phone Number to Update");
						String phNumber =inputScanner.inputString();
						contatctDetails.get(i).setPhoneNumber(phNumber);
						break;
					case 4:
						System.out.println("enter the Pincode/Postalcode to Update");
						String pinC = inputScanner.inputString();
						contatctDetails.get(i).setZip(pinC);
						break;
					case 5:
						System.out.println("enter the Address to Update");
						String address =inputScanner.inputString();
						contatctDetails.get(i).setAddress(address);
						break;
					case 6:
						System.out.println("enter the Email to Update");
						String email =inputScanner.inputString();
						contatctDetails.get(i).setEmail(email);
						break;
					case 7:
						System.out.println("enter the State to Update");
						String state = inputScanner.inputString();
						contatctDetails.get(i).setState(state);
						break;
					default:
						System.out.println("you have not update any details");
						break;
					}

				} else
					System.out.println("not match any details");
			}
		}

		public void deleteDetails(ArrayList<AddContact> contatctDetails) {
			System.out.println("enter the name");
			String name =inputScanner.inputString();
			for(int i = 0; i < contatctDetails.size(); i++ ) {
				if (contatctDetails.get(i).getFirstName().equals(name)) {
					contatctDetails.remove(i);
				} else 
					System.out.println("not match any details");
			}
		}
	}
	

