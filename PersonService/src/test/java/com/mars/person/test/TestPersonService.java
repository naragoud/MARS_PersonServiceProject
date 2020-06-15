package com.mars.person.test;

import org.aspectj.lang.annotation.Before;
import org.jboss.logging.Logger;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.mars.person.repo.PersonRepo;
import com.mars.person.service.PersonService;

public class TestPersonService {
	
	Logger logger = Logger.getLogger(TestPersonService.class);
	 @InjectMocks
	PersonService personService;
	 @Mock
	 PersonRepo personRepo;
	 
	 @Before(value = "init")
	    public void init() {
	        MockitoAnnotations.initMocks(this);
	    }
	 
	 
	 @Test
	    public void deletePersonByIdTest()
	    {
		 
		 
	    }
	    

}
