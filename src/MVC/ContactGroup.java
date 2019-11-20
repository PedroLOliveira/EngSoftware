package MVC;

import java.util.ArrayList;
import java.util.List;

public class ContactGroup {

	private String name;
	public List<Contact> contacts = new ArrayList<Contact>();
	public List<ContactGroup> groups = new ArrayList<ContactGroup>();
	public AddressBook addressBook;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
