package com.prudent.domain;

import java.io.Serializable;

public class CustomerFilingRecord implements Serializable {
	private static final long serialVersionUID = 6975847443124182419L;

	// TODO own or rent
	private String residentType;
	private String ownCar;
	private String earningType;
	private String filingType;
	private double reportedIncome;
	private String contactPhoneNumber;
	private Customer taxpayer;
	private Person spouse;
	private Person[] dependents;
	private String irsAuditNotice;
	private double feeCharged;
	private int filingYear;
	private double federalTaxRefund;
	private StateRefund[] stateRefunds;

	public CustomerFilingRecord(Customer taxpayer, int filingYear) {
		this.taxpayer = taxpayer;
		this.filingYear = filingYear;
	}

	public int getFilingYear() {
		return filingYear;
	}
	public Customer getTaxpayer() {
		return taxpayer;
	}

	public String getFilingType() {
		return filingType;
	}

	public void setFilingType(String filingType) {
		this.filingType = filingType;
	}
	public String getContactPhoneNumber() {
		return contactPhoneNumber;
	}
	public void setContactPhoneNumber(String contactPhoneNumber) {
		this.contactPhoneNumber = contactPhoneNumber;
	}

	public Person getSpouse() {
		return spouse;
	}
	public void setSpouse(Person spouse) {
		this.spouse = spouse;
	}
	public Person[] getDependents() {
		return dependents;
	}
	public void setDependents(Person[] dependents) {
		this.dependents = dependents;
	} 

	public String getResidentType() {
		return residentType;
	}

	public void setResidentType(String residentType) {
		this.residentType = residentType;
	}

	public String isOwnCar() {
		return ownCar;
	}

	public void setOwnCar(String ownCar) {
		this.ownCar = ownCar;
	}

	public String getEarningType() {
		return earningType;
	}

	public void setEarningType(String earningType) {
		this.earningType = earningType;
	}

	public double getReportedIncome() {
		return reportedIncome;
	}

	public void setReportedIncome(double reportedIncome) {
		this.reportedIncome = reportedIncome;
	}

	public double getFederalTaxRefund() {
		return federalTaxRefund;
	}

	public void setFederalTaxRefund(double federalTaxRefund) {
		this.federalTaxRefund = federalTaxRefund;
	}

	public StateRefund[] getStateRefunds() {
		return stateRefunds;
	}

	public void setStateRefunds(StateRefund[] stateRefunds) {
		this.stateRefunds = stateRefunds;
	}

	public String getIrsAuditNotice() {
		return irsAuditNotice;
	}

	public void setIrsAuditNotice(String irsAuditNotice) {
		this.irsAuditNotice = irsAuditNotice;
	}

	public double getFeeCharged() {
		return feeCharged;
	}

	public void setFeeCharged(double feeCharged) {
		this.feeCharged = feeCharged;
	}

	@Override
	public String toString() {
		return getTaxpayer() + " filed on " + getFilingYear();
	}
}
