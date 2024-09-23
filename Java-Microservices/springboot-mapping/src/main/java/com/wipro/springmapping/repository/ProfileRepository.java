package com.wipro.springmapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.springmapping.entity.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

}
