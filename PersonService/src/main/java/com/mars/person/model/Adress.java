package com.mars.person.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS")
public class Adress {
	Adress() {

	}
	public Adress(Long adressId, String street, String city, String state, String pinCode) {
		super();
		this.adressId = adressId;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}
	@Id
	@GeneratedValue
	@Column(name = "ADRESS_ID",nullable=false)
	public Long getAdressId() {
		return adressId;
	}
	public void setAdressId(Long adressId) {
		this.adressId = adressId;
	}
	@Column(name = "STREET",nullable = false, length=50)
    public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Column(name = "CITY",nullable = false, length=50)
    public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Column(name = "STATE",nullable = false, length=250)
    public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Column(name = "PIN_CODE", nullable = false, length=250)
    public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	private Long adressId;
	private String street;
	private String city;
	private String state;
	private String pinCode;
	
}
