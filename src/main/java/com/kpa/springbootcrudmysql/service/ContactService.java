package com.kpa.springbootcrudmysql.service;


import com.kpa.springbootcrudmysql.model.Contact;
import com.kpa.springbootcrudmysql.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

	@Autowired
	private ContactRepository contactRepository;
	
	//Return list of contacts
	public List<Contact> getContacts(){
		return contactRepository.findAll();
	}
	
	//SAve new contact
	public void save(Contact contact) {
		contactRepository.save(contact);
	}
	
	//get by id
	public Optional<Contact> findById(int id) {
		return contactRepository.findById(id);
	}

	public void delete(Integer id) {
		contactRepository.deleteById(id);
	}
	
}
