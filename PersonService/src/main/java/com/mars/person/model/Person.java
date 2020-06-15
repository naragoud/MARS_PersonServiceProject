package com.mars.person.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "PERSON")
public class Person {
	
	Long person_id;
    String firstName;
	String lastName;
	Long adress_Id;
	
	@Column(name="ADRESS_ID")
	public Long getAdress_Id() {
		return adress_Id;
	}
	public void setAdress_Id(Long adress_Id) {
		this.adress_Id = adress_Id;
	}

	Adress adress;
	
	public Person()
	{
		
	}
	
	@Id
	@GeneratedValue
	@Column(name = "PERSON_ID")

	public Long getPerson_id() {
		return person_id;
	}
	
	
	@Column(name = "PERSON_FIRST_NAME")
	public String getFirstName() {
		return firstName;
	}
	@Column(name = "PERSON_LAST_NAME", nullable = false, length = 250)
    public String getLastName() {
		return lastName;
	}
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
    public Adress getAdress() {
		return adress;
	}
	
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	public void setPerson_id(Long person_id) {
		this.person_id = person_id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/*public Person(Long person_id, String firstName, String lastName, Adress adress) {
		super();
		this.person_id = person_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.adress = adress;
	}*/
	public Person(Long person_id, String firstName, String lastName, Long adress_Id, Adress adress) {
		super();
		this.person_id = person_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.adress_Id = adress_Id;
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Person [person_id=" + person_id + ", firstName=" + firstName + ", lastName=" + lastName + ", adress_Id="
				+ adress_Id + ", adress=" + adress + "]";
	}
	
	
	
	
	

}
