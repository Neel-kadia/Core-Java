/**
 *	This program demonstrates hybrid inheritance using an interface.
 *	Hybrid inheritance is not supported through class in java, but it is possible by an interface.
 *	we can achieve hybrid inheritance through interfaces.
 *	COPYRIGHT (C) 2022 QDEV TECHNOLAB. All rights reserved.
 *	@author Neel
 *	@version 1.0.0
 */
class ClassA {

	public void displayA() {
		System.out.println("display method of class A");
	}

}

interface InterfaceB {

	public void show(); //method without body

}

interface InterfaceC {

	public void show(); //method without body

}

class ClassD extends ClassA implements InterfaceB,InterfaceC {

	public void show() { //show method implementation
		System.out.println("show method implementation");
	}
	public void displayD() { //display method implementation
		System.out.println("display method of class D");
	}

}

public class HybridInheritance {

	public static void main(String[] args) {
		ClassD dObj = new ClassD();
		dObj.show();
		dObj.displayD();
		dObj.displayA();
	}

}