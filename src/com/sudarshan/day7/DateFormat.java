package com.sudarshan.day7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormat {
	private LocalDate localDate;

	public DateFormat() {
		super();
	}

	public DateFormat(String dateString) {
		super();
//		this.commonDate = dateString;
		// commonDate = new SimpleDateFormat("ddMMyyyy").parse(dateString);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
		localDate = LocalDate.parse(dateString, formatter);
		System.out.println(localDate.toString());
	}

	public String getFormateOne() {
//		System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(commonDate));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		localDate.format(formatter);
		System.out.println(localDate.format(formatter));
		return localDate.format(formatter);
	}

//
	public String getFormateTwo() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd,MMMM,yyyy");
		System.out.println(localDate.format(formatter));
		return localDate.format(formatter);
	}

}
