package com.prestes.aulajwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.prestes.aulajwt.model.User;
import com.prestes.aulajwt.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	@Autowired
	private PasswordEncoder encoder;
	
	
	public void createUser(User user) {
		String pass = user.getPassword();
		
		//criptografar antes de passar para o banco
		user.setPassword(encoder.encode(pass));
		
		repository.save(user);
	}
	
	

}
