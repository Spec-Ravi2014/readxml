package com.java.bean;

public class NewClass {

	
	public static void main(String[] args) {
		
		Date date=new  Date();
		
		System.out.println(date.toString());
		
		SimpleDateFormat simpleDateFormat=new  SimpleDateFormat("yyyy-dd" +
				"-MM");
		
		System.out.println(simpleDateFormat.format(date));
		
		System.out.println("Change in test date class");
		
	}
}
