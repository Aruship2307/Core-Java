package com.java8features;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class StringToDateConversion {

	public static void main(String[] args) throws ParseException {
	// String to java.util.date	
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd:MM:yyyy hh:mm:ss a");  // a = AM/PM
    String dateString = "27-Dec-2023 11:05:23 PM";
    Date date = simpleDateFormat.parse(dateString);
    System.out.println(date);
    
    // String to java.time.LocalDate 
    LocalDate localDate = LocalDate.parse("1997-07-23");
    System.out.println(localDate);

	}

}
