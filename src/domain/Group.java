package domain;

import java.util.HashSet;
import java.util.Set;

public class Group {
	private long id;
	private String groupName;
	private Set<Contact> contacts = new HashSet<Contact>();
	
	
	public Group(){}

	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}


	public Set<Contact> getContacts() {
		return contacts;
	}


	public void setContacts(Set<Contact> contacts) {
		this.contacts = contacts;
	}

	
	
}
