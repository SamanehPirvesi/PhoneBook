package phoneBook;

public class Contact {

	private String contactName;
	private String contactSurname;
	private int contactTel;

	public Contact(String contactName, String contactSurname, int contactTel) {
		super();
		this.contactName = contactName;
		this.contactSurname = contactSurname;
		this.contactTel = contactTel;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactSurname() {
		return contactSurname;
	}

	public void setContactSurname(String contactSurname) {
		this.contactSurname = contactSurname;
	}

	public int getContactTel() {
		return contactTel;
	}

	public void setContactTel(int contactTel) {
		this.contactTel = contactTel;
	}

}
