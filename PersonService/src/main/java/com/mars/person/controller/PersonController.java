package com.mars.person.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mars.person.model.Person;
import com.mars.person.service.PersonService;

@RestController
public class PersonController 
{
    @Autowired 
	PersonService personService;
    private static final Logger logger = LoggerFactory.getLogger(PersonController.class);

	@RequestMapping(value="/addPerson",method=RequestMethod.POST )
	public ResponseEntity<Object> addPerson(@RequestBody Person person) {
	     
		logger.info("PersonController : : addPerson(@RequestBody Person person) ....Started "+person.toString());
		logger.info("PersonController : : PersonService Object"+personService);
        personService.addPerson(person);
		logger.info("PersonController : : addPerson(@RequestBody Person person) ....Success Full Completed ");
        return new ResponseEntity<>("Person is created successfully", HttpStatus.CREATED);

	} 
	
	@RequestMapping(value = "/updatePerson/{id}", method = RequestMethod.PUT)
	   public ResponseEntity<Object> updateProduct(@PathVariable("id") Long id, @RequestBody Person person) { 
		logger.info("PersonController : : updatePerson() ....Started "+person.toString());
		logger.info("PersonController : : calling deletePerson() ....Started wit personId is "+id);

		personService.deletePerson(id);
		logger.info("PersonController : : calling deleteId()  Completed ....");
		logger.info("PersonController : :  Updating Started  ....");

		person.setPerson_id(person.getPerson_id());
		person.setFirstName(person.getFirstName());
		person.setLastName(person.getLastName());
		person.setAdress(person.getAdress());
		personService.addPerson(person);
		logger.info("PersonController : :  Updating Completed  ....");
        logger.info("PersonController : : updatePerson(@RequestBody Person person) ....Success Full Completed ");
		return new ResponseEntity<>("Product is updated successsfully", HttpStatus.OK);
	   }   
	
	
	
		@RequestMapping(value="/deletePerson/{id}",method=RequestMethod.DELETE)

    public ResponseEntity<Object> deletePerson(@PathVariable (value="id") Long person_Id)  
	{
		logger.info("PersonController : : deletePerson() ....Started with Person Id" + person_Id );
        
		Person person = personService.findByPersonId(person_Id);
		
		personService.deletePerson(person);
		logger.info("PersonController : : deletePerson(@RequestBody Person person) ....Success Full Completed ");
		return new ResponseEntity<>("Product is Deleted successsfully", HttpStatus.OK);


	}
		
}
