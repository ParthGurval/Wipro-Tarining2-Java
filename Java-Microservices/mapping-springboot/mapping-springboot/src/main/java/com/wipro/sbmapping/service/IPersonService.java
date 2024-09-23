package com.wipro.sbmapping.service;

import java.util.List;

import com.wipro.sbmapping.entity.Person;

public interface IPersonService {
	
	Person savePerson(Person person);
	
    Person updatePerson(Long id, Person person);
    
    void deletePerson(Long id);
    
    List<Person> getAllPersons();
    
    Person getPersonById(Long id);

}
