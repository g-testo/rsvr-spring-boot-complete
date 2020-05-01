package com.tts.rsvrInClass.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tts.rsvrInClass.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	User findUserById(Long id);
	
}
