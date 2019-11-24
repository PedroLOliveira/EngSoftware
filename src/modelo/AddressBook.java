package modelo;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

	private String name;
	public List<Contact> contacts = new ArrayList<Contact>();
	public List<ContactGroup> groups = new ArrayList<ContactGroup>();
	
	public Contact getContact(String name) {
		return this.contacts.get(0);
	}
	
	public List<Contact> getContacts() {
		return this.contacts;
	}
	
	public String getName() {
		return name;
	}
	
	public void insertContact(Contact contact) {
		this.contacts.add(contact);
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
