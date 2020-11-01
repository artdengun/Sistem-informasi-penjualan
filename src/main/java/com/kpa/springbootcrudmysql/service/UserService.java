package com.kpa.springbootcrudmysql.service;


import com.kpa.springbootcrudmysql.model.User;
import com.kpa.springbootcrudmysql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {



	@Autowired
	private UserRepository userRepository;


	//Return nilai Barang
	public List<User> getUser(){
		return (List<User>) userRepository.findAll();
	}

	public List<User> getLaporanUser() {
			return (List<User>) userRepository.findAll();
	}

	//SAve new contact
	public void save(User user) {
		userRepository.save(user);
	}

	//get by id
	public Optional<User> findById(Integer id_user) {
		return userRepository.findById(id_user);
	}
	// return delete
	public void delete(Integer id_user) {
		userRepository.deleteById(id_user);
	}


}
