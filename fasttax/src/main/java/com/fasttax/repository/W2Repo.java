package com.fasttax.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fasttax.entity.W2;

@Repository
public interface W2Repo extends JpaRepository<W2, Integer>
{
	//  @Query("Select T from Taxpayer T where T.email = ?1 and T.password = ?2")
	/*  Taxpayer login(String email, String password);    */
}