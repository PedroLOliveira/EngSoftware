package MVC;

import java.util.ArrayList;
import java.util.List;

public class Contact {

	private String emailAddress;
	private String faxNumber;
	private String name;
	private String primaryContactMethod;
	public List<ContactGroup> groups = new ArrayList<ContactGroup>();
	public List<AddressBook> addressBooks = new ArrayList<AddressBook>();
	
	public String getEmailAdress() {
		return emailAddress;
	}
	
	public String getFaxNumber() {
		return faxNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPrimaryContactMethod() {
		return primaryContactMethod;
	}
	
	
	public void setEmailAdress(String emailAdress) {
		this.emailAddress = emailAdress;
	}
	
	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrimaryContactMethod(String primaryContactMethod) {
		this.primaryContactMethod = primaryContactMethod;
	}
}
