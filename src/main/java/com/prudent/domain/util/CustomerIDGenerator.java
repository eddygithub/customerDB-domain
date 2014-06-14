package com.prudent.domain.util;

import org.apache.commons.lang3.RandomStringUtils;

public class CustomerIDGenerator {

	public static String getNextValue(){
		return RandomStringUtils.randomAlphanumeric(8).toUpperCase();
	}
}
