package com.phonebook.service;

import java.util.List;


import com.phonebook.eniity.ContactEntity;

public interface ContactService {

	// create contact
	public boolean saveContact(ContactEntity contact);

	// display all contact
	public List<ContactEntity> getAllContacts();

	// edit contact
	public ContactEntity getContactById(Integer contactId);

	// delete contact
	public boolean deleteContactById(Integer contactId);

}
