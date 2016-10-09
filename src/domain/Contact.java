package domain;

import java.util.HashSet;
import java.util.Set;

public class Contact {
	private long id;
	private String nom;
	private String prenom;
	private String mail;
	private Set<Group> groups = new HashSet<Group>();
	private Set<PhoneNumber> phoneNumber = new HashSet<PhoneNumber>();
	
	
	public Contact(){}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}


	public Set<Group> getGroups() {
		return groups;
	}


	public void setGroups(Set<Group> groups) {
		this.groups = groups;
	}


	public Set<PhoneNumber> getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(Set<PhoneNumber> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
}
