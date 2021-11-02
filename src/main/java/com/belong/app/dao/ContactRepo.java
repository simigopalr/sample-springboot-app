package com.belong.app.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.belong.app.model.Contact;

public interface ContactRepo extends Repository <Contact, Integer>{		
	Contact findByContactNumber(String contactNumber);	
	
	List<Contact> findByLastNameAndFirstNameIgnoreCase(String lastName, String firstName);	
	
	Optional<Contact> findById(int id);	
	
	List<Contact> findAll();	
	
	Contact saveAndFlush(Contact contact);	
}
