package com.fasttax.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasttax.entity.W2;
import com.fasttax.repository.W2Repo;

@Service
public class W2Service 
{
	@Autowired  		 //use this in place of creating a new object with spring
	W2Repo w2Repo;
	
	public void saveUserW2(W2 W2) 
	{
		w2Repo.save(W2);
	}	
	
	/*
	public Taxpayer getTaxpayer(String email, String password) 
	{		
		return userRepo.login(email,  password);	
	}	
	*/

}



