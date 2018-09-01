package com.sudarshan.day7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.swing.text.DateFormatter;

public class DateFormat {
	private Date commonDate;

	public DateFormat() {
		super();
	}

	public DateFormat(String dateString) {
		super();
		try {
			commonDate = new SimpleDateFormat("ddMMyyyy").parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getFormateOne() {
		
		
		
		System.out.println( new SimpleDateFormat("dd/MM/yyyy").format(commonDate));
		return new SimpleDateFormat("dd/MM/yyyy").format(commonDate);
	}

	public String getFormateTwo() {
//		String dateFormat = commonDate.getDay() + "," + commonDate.getMonth() + "," + commonDate.getYear();
		System.out.println(new SimpleDateFormat("dd,MMMM,yyyy").format(commonDate));
		return new SimpleDateFormat("dd,MMMM,yyyy").format(commonDate);
	}

	
}
