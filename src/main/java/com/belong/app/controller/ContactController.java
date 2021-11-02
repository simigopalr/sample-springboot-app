package com.belong.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.belong.app.model.Contact;
import com.belong.app.service.ContactService;

@RestController
@RequestMapping("belong/contacts")
public class ContactController {	
	
	@Autowired
	ContactService service;
	
	//List all contacts
	@GetMapping	
	public ResponseEntity<List<Contact>> getContacts() {					
		return service.getContacts();
	}
	
	//Get contact details for a given number
	@GetMapping("/{contactno}")
	public ResponseEntity<Contact> getContact(@PathVariable("contactno") String contactno) {	
		return service.getContact(contactno);	
	}
	
	//Get contact details for given first name and last name
	@GetMapping("/search")	
	public ResponseEntity<List<Contact>> search(@RequestParam("lastname") String lastname, @RequestParam("firstname") String firstname) {				
		return service.searchByLastNameAndFirstName(lastname, firstname);	
	}	
	
	//Activate a contact number
	@PutMapping("/{contactno}/activate")
	public ResponseEntity<Contact> activateContact(@PathVariable("contactno") String contactno) {		
		return service.activateContactNumber(contactno);
	}

}
