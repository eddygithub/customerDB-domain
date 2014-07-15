package com.prudent.domain;

import java.io.Serializable;

public class StateRefund implements Serializable{
	private static final long serialVersionUID = 6303991727282506046L;
	private String stateCode;
	private double stateRefund;

	public StateRefund(String stateCode, double stateRefund) {
		this.stateCode = stateCode;
		this.stateRefund = stateRefund;
	}

	public String getStateCode() {
		return stateCode;
	}

	public double getStateRefund() {
		return stateRefund;
	}
}
