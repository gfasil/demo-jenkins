package com.fayaman.demojenkins.service;

import com.fayaman.demojenkins.domain.CustomerContact;
import com.fayaman.demojenkins.repos.CustomerContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactsManagementService {

	@Autowired
	private CustomerContactRepository customerContactRepository;
	
	public CustomerContact add(CustomerContact aContact) {
		CustomerContact newContact = null;
		if(aContact.getFirstName()!=null) 	  newContact =customerContactRepository.save(aContact);
		
		/*
		if (aContact.getFirstName() != null) {
			
		} 
		*/
		return newContact;	
	}

	public CustomerContact get(String email) {
	return	customerContactRepository.findByEmail(email);
	}
	
	/*
	public CustomerContact addContactOccasion(CustomerContact aContact, ContactImportantOccasion anOccasion) {
		CustomerContact newContact = null;
		
		return newContact;	
	}
	*/
}
