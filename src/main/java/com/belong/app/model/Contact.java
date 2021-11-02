package com.belong.app.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Contact {

	@Id
	private int id;		
	private String firstName;
	private String lastName;
	
	@NotNull
	@Column(unique = true)
	private String contactNumber;
	private boolean activateFlag;
	
	@ManyToOne
	@JoinColumn(name = "aid")
	private Address address;	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}		
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public boolean isActivateFlag() {
		return activateFlag;
	}
	public void setActivateFlag(boolean activateFlag) {
		this.activateFlag = activateFlag;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", contactNumber="
				+ contactNumber + ", activateFlag=" + activateFlag + "]";
	}	
	
}
