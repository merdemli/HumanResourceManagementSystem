package io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import io.hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{
	
	User findUserByEmail(String email);

}
