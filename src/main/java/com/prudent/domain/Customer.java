package com.prudent.domain;

import org.springframework.data.annotation.Id;

public class Customer extends Person {
	private static final long serialVersionUID = -8027029869628993724L;

	@Id
	public String customerID;
	
	//user is the userId who is responsible for this customer
	//this value can be null for customer who is not serve by anyone at this point
	public Long userID;
	
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getCustomerID() {
		return customerID;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public Customer(String firstName, String middleName, String lastName,
			String ssn) {
		super(firstName, middleName, lastName, ssn);
	}
	
	@Override
	public boolean equals(Object obj) {
		Customer compareTo = (Customer)obj;
		
		return customerID.equalsIgnoreCase(compareTo.getCustomerID());
	}

	@Override
	public String toString() {
		String customerString = String.format(
				"Customer ID: %s, full name: %s %s, SSN: %s", customerID,
				getFirstName(), getLastName(), getSsn());
		return customerString;
	}
}