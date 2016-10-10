package domain;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;

public class ContactDAO {
	List<Contact> contacts;
	public void createContact(String nom, String prenom, String mail,String leGroupe)
	{
		System.out.println("J'ajoute un contact : " + nom + " " + prenom + " " + mail);
		Contact contact = new Contact();
		contact.setNom(nom);
		contact.setPrenom(prenom);
		contact.setMail(mail);
		Group groupe = new Group();
		groupe.setGroupName(leGroupe);
		
		try {
		//Obtention d’une session
		Session session =
		HibernateUtil.getSessionFactory().getCurrentSession();
		//démarrer une transaction
		session.beginTransaction();
		//persister l’objet
		contact.getGroups().add(groupe);
		session.save(contact);
		session.save(groupe);
		//committer la transaction
		session.getTransaction().commit();
		}catch(Exception e){
			throw e;
		}

		System.out.println("Created successfully!");
	}
	
	public void removeContact(String id)
	{
		System.out.println("Je supprime un contact : " + id);		
		Contact contact = new Contact();
		long l = Long.parseLong(id);
		contact.setId(l);
		
		try{
		//Obtention d’une session
		Session session =
		HibernateUtil.getSessionFactory().getCurrentSession();
		//démarrer une transaction
		session.beginTransaction();
		//persister l’objet
		session.delete(contact);
		//committer la transaction
		session.getTransaction().commit();
		}catch(Exception e){
			throw e;
		}
		System.out.println("Deleted successfully!");		
	}
	
	public void searchContact()
	{
//		System.out.println("Je cherche un contact : " + nom + " " + prenom + " " + mail);
		Session session =HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
	}
	
	public void updateContact(String id, String nom, String prenom, String mail)
	{
		System.out.println("Je modifie un contact : "+ id + " " + nom + " " + prenom + " " + mail);
		
		try{
		//Obtention d’une session
		Session session =
		HibernateUtil.getSessionFactory().getCurrentSession();
		//démarrer une transaction
		session.beginTransaction();
		Contact contact = new Contact(); 
		long idLong = Long.parseLong(id);
		contact.setId(idLong);
		contact.setMail(mail);
		contact.setNom(nom);
		contact.setPrenom(prenom);
		session.update(contact); 
		session.getTransaction().commit();
		}catch(Exception e){
			throw e;
		}
		System.out.println("Updated successfully!");
	}
	
	public List<Contact> getListOfContacts(){
		System.out.println("J'affiche les contacts: ");
		try{
			Session session =HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
	
			contacts = (List<Contact>) session.createQuery("from Contact").list();
			for(Contact contact : contacts)
			{
				System.out.println("nom " + contact.getNom() + " | prenom " + contact.getPrenom());	
			}
			session.getTransaction().commit();	
		}catch(Exception e){
			throw e;
		}
		System.out.println("Displayed successfully!");
		return contacts;
	}
}
