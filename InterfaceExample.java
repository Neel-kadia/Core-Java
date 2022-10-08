/**
 *	This program demonstrates an interface.
 *	an interface extends another interface 
 *	a class implements an interface 
 *	COPYRIGHT (C) 2022 QDEV TECHNOLAB. All rights reserved.
 *	@author Neel
 *	@version 1.0.0
 */
interface Printable {

	void print(); //method without body

}

interface Showable extends Printable { //The Showable interface extends The printable interface

	void show(); //method without body
	
}

class Test implements Showable { //Test class implements the Showable interface

	public void print() { //implementation of method 
		System.out.println("print method"); 
	}
	public void show() { //implementation of method 
		System.out.println("show method");
	}

}

public class InterfaceExample {

	public static void main(String[] args) {
		Test testObj = new Test();
		testObj.print(); //called print method
		testObj.show(); //called show method 
	}

}