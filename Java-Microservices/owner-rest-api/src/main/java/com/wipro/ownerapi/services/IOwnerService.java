package com.wipro.ownerapi.services;

import java.util.List;

import com.wipro.ownerapi.entity.Owner;


public interface IOwnerService {
	
	public Owner addOwner(Owner ow);
    
	public Owner updateOwner(Owner ow);
	
	public Owner getOwnerById(int owner_id);
    
	public String deleteOwnerById(int owner_id);
     
    public List<Owner> getAllOwner();

}
