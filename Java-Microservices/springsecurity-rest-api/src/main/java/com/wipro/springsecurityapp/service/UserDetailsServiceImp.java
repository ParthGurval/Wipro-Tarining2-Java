package com.wipro.springsecurityapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.wipro.springsecurityapp.entity.UserEntity;
import com.wipro.springsecurityapp.repository.UserRepository;

@Service
public class UserDetailsServiceImp implements UserDetailsService {
	
	@Autowired
	UserRepository repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

				UserEntity user = repo.findByUserName(username);
		
					if(user == null)
					{
						
						throw new UsernameNotFoundException(username);
						
					}
					
				
					return  new UserDetailsImp(user);
		
	}
	

}
