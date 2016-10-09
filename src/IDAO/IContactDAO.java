package IDAO;
import java.util.ArrayList;
import java.util.List;

import domain.Contact;

public interface IContactDAO {
	public void createContact(String nom, String prenom, String mail,String groupe);
	public void removeContact(String id);
	public void searchContact();
	public void updateContact(String id, String nom, String prenom, String mail);
	public List<Contact> getListOfContacts();
	public boolean deleteContact(Contact contact);
	public Contact updateContact(Contact contact);
	public Contact findContactById(long id);
	public ArrayList<Contact> findContactByLastName(String lastname);
	public ArrayList<Contact> findContactByEmail(String email);
}
