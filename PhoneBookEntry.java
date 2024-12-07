
public class PhoneBookEntry {

	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private int zipcode;
	private String phonenumber;
	
	public PhoneBookEntry() {
		
		id = -1;
		firstname = "";
		lastname = "";
		email = "";
		zipcode = -1;
		phonenumber = "";
	}
	
	public PhoneBookEntry(int id1, String firstname1, String lastname1, String email1, int zipcode1, String phonenumber1) {
		
		id = id1;
		firstname = firstname1;
		lastname = lastname1;
		email = email1;
		zipcode = zipcode1;
		phonenumber = phonenumber1;
		
	}
	
	public PhoneBookEntry(String firstname2, String phonenumber2) {
		
		firstname = firstname2;
		phonenumber = phonenumber2;
	}
	
	public PhoneBookEntry(String firstname3) {
		
		firstname = firstname3;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public void printBookEntry() {
			
		System.out.println("ID: " + id);
		System.out.println("First Name: " + firstname);
		System.out.println("Last Name: " + lastname);
		System.out.println("Email: " + email);
		System.out.println("Zip Code: " + zipcode);
		System.out.println("Phone Number: " + phonenumber);
	}
	
}
