package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	User findByUserNameAndPassword(String userName, String password);
}
