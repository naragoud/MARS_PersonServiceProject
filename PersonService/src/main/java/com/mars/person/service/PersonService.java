package com.mars.person.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mars.person.model.Person;


@Service
public interface PersonService {
	
	 public void addPerson(Person person);
	 public void updatePerson(Person person);
	 public void deletePerson(Long person_Id);
	public Person findByPersonId(Long person_Id);
	public void deletePerson(Person person);


}
