package phoneBook;

public class MainPhoneBook {

	public static void main(String[] args) {

		Contact c1 = new Contact("sara", "kashefi", 1345);
		Contact c2 = new Contact("zahra  ", "ahmadi ", 5678);
		Contact c3 = new Contact("mina  ", "zahedi ", 6);

		PhoneBook p1 = new PhoneBook("samaneh  ");
		PhoneBook p2 = new PhoneBook("mahsa  ");

		p1.addContact(c1);
		p1.addContact(c2);
		p2.addContact(c3);
		// p1.findContactByPhone(65445);
		Contact c = p1.findContactByPhone(2324);
		if (c != null) {
			System.out.println(c.getContactName() + c.getContactTel());
		} else {
			System.out.println("the number is not exist");
		}
		Contact h = p1.findPhoneNumberByName("sara", "kashefi");

		if (h != null) {
			System.out.println(h.getContactName() + h.getContactTel());
		} else {
			System.out.println("the number is not exist");
		}
		// for(Contact c : p1.getContacts()) {
		// System.out.println(c.getContactName()+c.getContactTel() );

	}

}
