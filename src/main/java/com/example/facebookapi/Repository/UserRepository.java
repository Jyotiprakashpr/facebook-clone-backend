package com.example.facebookapi.Repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.facebookapi.Entity.User;

public interface UserRepository extends JpaRepository<User, String> {

	User save(User user);
	ArrayList<User> findAll();
	User findAllByuserID(String userID);
	
}
