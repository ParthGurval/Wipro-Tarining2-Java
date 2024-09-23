package com.wipro.ownerapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.ownerapi.entity.Owner;

@Repository
public interface OwnerRepository  extends JpaRepository<Owner, Integer> {

}
