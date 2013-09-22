package org.robotframework.multiples;

public class Multiples {

	private String name;
	 
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
 
	public void printHello() {
		System.out.println("Hello ! " + name);
	}

}
