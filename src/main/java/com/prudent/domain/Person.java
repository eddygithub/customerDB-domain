package com.prudent.domain;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable{
	
	private static final long serialVersionUID = -7714160957638348764L;
	private String firstName;
	private String lastName;
	private String middleName;
	private String legalStatus;
	private Address livingAddress;
	private Address mailingAddress;
	private String perferredDialect;
	private Date dateOfBirth;
	private String phoneNumber;
	private String ssn;
	private String email;
	private String personality;

	public Person(String firstName, String middleName, String lastName,
			String ssn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getMiddleName() {
		return middleName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Address getLivingAddress() {
		return livingAddress;
	}

	public void setLivingAddress(Address livingAddress) {
		this.livingAddress = livingAddress;
	}

	public Address getMailingAddress() {
		return mailingAddress;
	}

	public void setMailingAddress(Address mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

	public String getPerferredDialect() {
		return perferredDialect;
	}

	public void setPerferredDialect(String perferredDialect) {
		this.perferredDialect = perferredDialect;
	}

	public String getLegalStatus() {
		return legalStatus;
	}

	public void setLegalStatus(String legalStatus) {
		this.legalStatus = legalStatus;
	}

	public String getPersonality() {
		return personality;
	}

	public void setPersonality(String personality) {
		this.personality = personality;
	}
}
