/**
 *	This program demonstrates multiple inheritances using an interface.
 *	Multiple inheritances are not supported through class in java, but it is possible by an interface.
 *	Test class implements printable and showable interfaces.
 *	COPYRIGHT (C) 2022 QDEV TECHNOLAB. All rights reserved.
 *	@author Neel
 *	@version 1.0.0
 */
interface Printable {

	void print(); //method without body

}

interface Showable {

	void show(); //method without body

}

class Test implements Printable, Showable { //Test class implements the printable and showable interface.

	public void print() { //print method implementation
		System.out.println("print method");
	}
	public void show() { //show method implementation
		System.out.println("show method");
	}

}

public class MultipleInheritance {

	public static void main(String[] args) {
		Test testObj = new Test(); //instance of test class 
		testObj.print();
		testObj.show();
    }

}