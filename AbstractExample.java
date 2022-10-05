/**
 *	This program demonstrates the use of abstract class and abstract methods.
 *	abstract class has abstract and non-abstract methods. 
 *	abstract class having constructor, data member, and methods.
 *  COPYRIGHT (C) 2022 QDEV TECHNOLAB. All rights reserved.
 *  @author Neel
 *	@version 1.0.0
 */
abstract class Bike {

	Bike() { //constructor
		System.out.println("Bike is created");
	}
	abstract void run(); //abstract method
	void changeGear() {
		System.out.println("gear changed");
	}

}
class Honda extends Bike {

	void run() {
		System.out.println("running safely");
	}

}
public class AbstractExample{

	public static void main(String[] args) {
		Bike obj = new Honda();
		obj.run();
		obj.changeGear();
	}

}