package com.belong.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.belong.app.dao.ContactRepo;
import com.belong.app.model.Contact;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	ContactRepo repo;

	@Override
	public ResponseEntity<Contact> getContact(String contactNo) {		
		Contact contact = repo.findByContactNumber(contactNo);		
		return new ResponseEntity<Contact>(contact, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<Contact>> getContacts() {		
		List<Contact> contactList = repo.findAll();
		return new ResponseEntity<List<Contact>>(contactList, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<Contact>> searchByLastNameAndFirstName(String lastName, String firstName) {		
		List<Contact> contactList = repo.findByLastNameAndFirstName(lastName, firstName);
		return new ResponseEntity<List<Contact>>(contactList, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Contact> activateContactNumber(String contactNumber) {		
		Contact contact = repo.findByContactNumber(contactNumber);	
		Contact	updatedContact = null;
		if(contact != null) {
			contact.setActivateFlag(true);			
			updatedContact = repo.saveAndFlush(contact);	
		}
		return new ResponseEntity<Contact>(updatedContact, HttpStatus.OK);
	}
}
