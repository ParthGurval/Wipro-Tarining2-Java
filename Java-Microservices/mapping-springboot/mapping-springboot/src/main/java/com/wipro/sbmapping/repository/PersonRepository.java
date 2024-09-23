package com.wipro.sbmapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.sbmapping.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
