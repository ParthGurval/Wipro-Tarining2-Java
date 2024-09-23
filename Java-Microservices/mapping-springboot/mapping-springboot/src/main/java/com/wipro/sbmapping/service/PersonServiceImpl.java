package com.wipro.sbmapping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.sbmapping.entity.Person;
import com.wipro.sbmapping.repository.PersonRepository;

@Service
public class PersonServiceImpl implements IPersonService {
	
    @Autowired
    private PersonRepository personRepository;

	@Override
	public Person savePerson(Person person) {
		// TODO Auto-generated method stub
		
		return personRepository.save(person);
	}

	@Override
	public Person updatePerson(Long id, Person person) {
		// TODO Auto-generated method stub

		Optional<Person> existingPerson = personRepository.findById(id);
        if (existingPerson.isPresent()) {
            Person updatedPerson = existingPerson.get();
            updatedPerson.setName(person.getName());
            updatedPerson.setEmail(person.getEmail());
            updatedPerson.setAge(person.getAge());
            updatedPerson.setPassport(person.getPassport());
            return personRepository.save(updatedPerson);
        }
        return null;
	}

	@Override
	public void deletePerson(Long id) {
		// TODO Auto-generated method stub
		
		personRepository.deleteById(id);
	}

	@Override
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return personRepository.findAll();
	}

	@Override
	public Person getPersonById(Long id) {
		// TODO Auto-generated method stub
		return personRepository.findById(id).orElse(null);
	}

}
