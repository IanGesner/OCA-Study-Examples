package com.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		LocalDate isoDate = LocalDate.now();
		
		System.out.println(time);
		System.out.println(isoDate);
		
		LocalDateTime dateTime = isoDate.atTime(time);
		System.out.println(dateTime);
		
		List list = new ArrayList();
		
		
	}

}
