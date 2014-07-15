package com.prudent.domain.util;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarUtil {

	public static int getCurrentYear() {
		GregorianCalendar gc = new GregorianCalendar();
		int year = gc.get(Calendar.YEAR);
		return year;
	}
}
