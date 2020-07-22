package com.fayaman.demojenkins.controller;


import com.fayaman.demojenkins.domain.CustomerContact;
import com.fayaman.demojenkins.service.ContactsManagementService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addContact")
public class ContactsManagementController {

	@Autowired
	private ContactsManagementService contactsManagementService;
	public static final Logger LOGGER=LoggerFactory.getLogger("log");

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public String processAddContactSubmit(@RequestBody CustomerContact aContact) {
		

		CustomerContact newContact = contactsManagementService.add(aContact);
		
		if (newContact != null) {
			LOGGER.info("not supported ",aContact);
			return "success";
		}

		return "redirect:/failure";
	}
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public CustomerContact getContact( ) {


		CustomerContact newContact = contactsManagementService.get("admin@gmail.com");

		if (newContact != null) {
			LOGGER.info("not supported ");
			return newContact;
		}

		return null;

	}
}
