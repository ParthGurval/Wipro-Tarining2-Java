package com.wipro.ownerapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.ownerapi.entity.Owner;
import com.wipro.ownerapi.repository.OwnerRepository;

@Service
public class OwnerServiceImpl implements IOwnerService {

	@Autowired
	private OwnerRepository repo;
	
	@Override
	public Owner addOwner(Owner ow) {
		// TODO Auto-generated method stub
		return repo.save(ow);
	}

	@Override
	public Owner updateOwner(Owner ow) {
		// TODO Auto-generated method stub
		return repo.save(ow);
	}

	@Override
	public Owner getOwnerById(int owner_id) {
		// TODO Auto-generated method stub
		return repo.findById(owner_id).orElse(null);
	}

	@Override
	public String deleteOwnerById(int owner_id) {
		// TODO Auto-generated method stub
		
		repo.deleteById(owner_id);
		
		return "Record deleted for Owner ID:" + owner_id;
	
	}

	@Override
	public List<Owner> getAllOwner() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	

}
