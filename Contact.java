public class Contact {
//member variables 
	public String contactID;
	public String firstName;
	public String lastName;
	public String numberAddress;
	
//parameterized constructor 
	public Contact(String contactID, String firstName, String lastName, String numberAddress) {
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.numberAddress = numberAddress;
	}

//setters and getters 
	public String getContactID() {
		return contactID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNumberAddress() {
		return numberAddress;
	}

	public void setNumberAddress(String numberAddress) {
		this.numberAddress = numberAddress;
	}

//method to check if two contacts are same or not 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if (contactID == null) {
			if (other.contactID != null)
				return false;
		} else if (!contactID.equals(other.contactID))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (numberAddress == null) {
			if (other.numberAddress != null)
				return false;
		} else if (!numberAddress.equals(other.numberAddress))
			return false;
		return true;
	}
}