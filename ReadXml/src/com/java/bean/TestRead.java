package com.java.bean;

import java.util.List;

public class TestRead {
	public static void main(String args[]) {
		ReadXml read = new ReadXml();
		List<Item> readConfig = read
				.readConfig("D:/convert_xml_to_java/ReadXml/src/com/java/bean/read.xml");
		for (Item item : readConfig) {
			System.out.println(item);
		}
	}
}