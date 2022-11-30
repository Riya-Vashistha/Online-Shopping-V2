package com.cts.customerService.service;

import java.util.Random;

public class IdGenerator{
	
	public static String generate(String name){
		Random rm = new Random();
		int i = rm.nextInt(99);
		i = (i<10)?i+10:i;
		return (name.substring(0, 3) + String.valueOf(i));
	}

}