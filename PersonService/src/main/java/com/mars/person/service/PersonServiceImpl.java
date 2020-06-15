package com.mars.person.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mars.person.controller.PersonController;
import com.mars.person.model.Adress;
import com.mars.person.model.Person;
import com.mars.person.repo.PersonRepo;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired 
	PersonRepo personRepo;
    private static final Logger logger = LoggerFactory.getLogger(PersonController.class);

	@Override
	public void addPerson(Person person) {
		logger.info("PersonServiceImpl : : addPerson(Person person : :" + person.toString());
        personRepo.save(person);
		logger.info("PersonServiceImpl : : addPerson(Person person) Succesfull" );

		}

	@Override
	public void updatePerson(Person person) {
		logger.info("PersonServiceImpl : : updatePerson(Person person)  .....started" + person.toString());
	Optional<Person> personRepoResponse = personRepo.findById((long) person.getPerson_id());
	logger.info("PersonServiceImpl : : updatePerson(Person person) .....Succesfull" + personRepoResponse.toString());

	
	}

	@Override
	public void deletePerson(Long id) {
		logger.info("PersonServiceImpl : : deletePerson  .....Started with .. PersonId is :  " + id);

		personRepo.deleteById(id);
		logger.info("PersonServiceImpl : : deletePerson  .....Completed Successfully ");

	}

	
	@Override
	public Person findByPersonId(Long person_Id) {
		Optional<Person> optional  =personRepo.findById(person_Id);
		
		Person person = optional.get();
		
		return person;
	}

	@Override
	public void deletePerson(Person person) {
		// TODO Auto-generated method stub
		personRepo.delete(person);
		
	}

}
