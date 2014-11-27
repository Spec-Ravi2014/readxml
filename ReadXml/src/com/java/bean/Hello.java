package com.java.bean;
//changed
public class Hello {

	private String name;

	public Hello(String name) {

		this.name = name;
	}

	public void sayHello() {
		System.out.println("Hello " + name);
	}
	
	public void playGame(String game)
	{
		
		System.out.println("playing game");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
