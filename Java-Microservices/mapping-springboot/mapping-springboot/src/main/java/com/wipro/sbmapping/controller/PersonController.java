package com.wipro.sbmapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.sbmapping.entity.Person;
import com.wipro.sbmapping.service.IPersonService;

@RestController
@RequestMapping("/api/persons")
public class PersonController {
	
	 	@Autowired
	    private IPersonService personService;

	    @PostMapping("/add")
	    public Person createPerson(@RequestBody Person person) {
	        return personService.savePerson(person);
	    }

	    @PutMapping("/update/{id}")
	    public Person updatePerson(@PathVariable Long id, @RequestBody Person person) {
	        return personService.updatePerson(id, person);
	    }

	    @DeleteMapping("/delete/{id}")
	    public void deletePerson(@PathVariable Long id) {
	        personService.deletePerson(id);
	    }

	    @GetMapping("/getall")
	    public List<Person> getAllPersons() {
	        return personService.getAllPersons();
	    }

	    @GetMapping("/getbyid/{id}")
	    public Person getPersonById(@PathVariable Long id) {
	        return personService.getPersonById(id);
	    }

}
