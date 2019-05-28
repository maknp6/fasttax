package com.fasttax.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasttax.entity.Taxpayer;
import com.fasttax.repository.UserRepo;


@Service
public class UserService 
{
	@Autowired  		 //use this in place of creating a new object with spring
	UserRepo userRepo;
	
	public void saveUser(Taxpayer taxpayer) 
	{
		userRepo.save(taxpayer);
	}	
	
	public Taxpayer getTaxpayer(String email, String password) 
	{		
		return userRepo.login(email,  password);	
	}	

}
	
	
		
	
	

