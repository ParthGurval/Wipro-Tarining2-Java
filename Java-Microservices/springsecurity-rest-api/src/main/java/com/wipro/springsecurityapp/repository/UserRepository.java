package com.wipro.springsecurityapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.springsecurityapp.entity.UserEntity;



public interface UserRepository extends JpaRepository<UserEntity, Long> {

	public UserEntity findByUserName(String username);
}
