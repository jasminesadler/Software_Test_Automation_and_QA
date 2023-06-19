import java.util.ArrayList;

public class ContactService {
//list of contacts 
	private ArrayList<Contact> contacts;

//constructor 
	public ContactService() {
		contacts = new ArrayList<>();
	}

//adds a given contact to our list if its not already present 
	public boolean add(Contact contact) {
//first we determine if the contact is already present 
		boolean alreadyPresent = false;
		for (Contact c : contacts) {
			if (c.equals(contact)) {
				alreadyPresent = true;
			}
		}
//if the contact is not present then we add it, and return true 
		if (!alreadyPresent) {
			contacts.add(contact);
			System.out.println("Contact Added Successfully!");
			return true;
		} else {
			System.out.println("Contact already present");
			return false;
		}
	}

//removes a contact with given contactId if present in our list
	public boolean remove(String contactID) {
		for (Contact c : contacts) {
			if (c.getContactID().equals(contactID)) {
				contacts.remove(c);	
				System.out.println("Contact removed Successfully!");
				return true;
			}
		}
		System.out.println("Contact not present");
		return false;
	}

//updates the contact of the given contactID, if found updates its
//firstname, last name and number address, pass an empty string if certain
//details are not to be changed
	
	public boolean update(String contactID, String firstName, String lastName, String numberAddress) {
		for (Contact c : contacts) {
			if (c.getContactID().equals(contactID)) {
				if (!firstName.equals(""))
					c.setFirstName(firstName);
				if (!lastName.equals(""))
					c.setLastName(lastName);
				if (!numberAddress.equals(""))
					c.setNumberAddress(numberAddress);
				System.out.println("Contact updated Successfully!");
				return true;
			}
		}
		System.out.println("Contact not present");
		return false;
	}

}