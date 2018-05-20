package phoneBook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

	private String nameOfOwner;
	private List<Contact> Contacts = new ArrayList<>();

	public PhoneBook(String nameOfOwner) {

		this.nameOfOwner = nameOfOwner;

	}

	public List<Contact> getContacts() {
		return Contacts;
	}

	public String getNameOfOwner() {
		return nameOfOwner;
	}

	public void setNameOfOwner(String nameOfOwner) {
		this.nameOfOwner = nameOfOwner;
	}

	public void setContacts(List<Contact> contacts) {
		Contacts = contacts;
	}

	public void addContact(Contact newContact) {
		this.Contacts.add(newContact);

	}

	public Contact findContactByPhone(int telNumber) {

		for (Contact c : getContacts()) {
			if (c.getContactTel() == telNumber) {
				return c;

			}

		}

		return null;

	}

	public Contact findPhoneNumberByName(String contactName, String contactFamily) {
		for (Contact h : getContacts()) {
			if (h.getContactName() == contactName && h.getContactSurname() == contactFamily) {
				return h;
			}
		}
		return null;
	}

}
