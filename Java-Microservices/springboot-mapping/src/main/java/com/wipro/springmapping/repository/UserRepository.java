package com.wipro.springmapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.springmapping.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
