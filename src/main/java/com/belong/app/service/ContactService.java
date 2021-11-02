package com.belong.app.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.belong.app.model.Contact;


public interface ContactService {	
	 public ResponseEntity<Contact> getContact(String contactNo);
	 public ResponseEntity<List<Contact>> getContacts();
	 public ResponseEntity<List<Contact>> searchByLastNameAndFirstName(String lastName, String firstName);
	 public ResponseEntity<Contact> activateContactNumber(String contactNumber);
}
