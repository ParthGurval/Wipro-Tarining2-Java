package com.wipro.sbmapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.sbmapping.entity.Passport;

public interface PassportRepository extends JpaRepository<Passport, Long> {

}
