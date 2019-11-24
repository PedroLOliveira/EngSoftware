package MVC;

import java.util.ArrayList;
import java.util.List;

public class Contact {

	private String email;
	private String fax;
	private String nome;
	private String primaryContactMethod;
	public List<ContactGroup> groups = new ArrayList<ContactGroup>();
	public List<AddressBook> addressBooks = new ArrayList<AddressBook>();
	
	public String getEmail() {
		return email;
	}
	
	public String getFax() {
		return fax;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getPrimaryContactMethod() {
		return primaryContactMethod;
	}
	
	
	public void setEmailAdress(String emailAdress) {
		this.email = email;
	}
	
	public void setFax(String fax) {
		this.fax = fax;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPrimaryContactMethod(String primaryContactMethod) {
		this.primaryContactMethod = primaryContactMethod;
	}
}
