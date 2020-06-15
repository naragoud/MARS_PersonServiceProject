/**
 * 
 */
package com.mars.person.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mars.person.model.Person;

/**
 * @author NaraGoud
 *
 */
@Repository
public interface PersonRepo extends JpaRepository<Person,Long> {
	
	

}
