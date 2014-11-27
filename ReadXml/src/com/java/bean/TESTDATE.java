package com.java.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TESTDATE {

	public static void main(String[] args) {

		Date date = new Date();

		System.out.println(date.toString());

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-dd"
				+ "-MM");

		System.out.println(simpleDateFormat.format(date));

		System.out.println("Change in test date class");

		System.out.println("TEST Date Also changed after ABC ");

	}
}
