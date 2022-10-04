/**
 *	This program is about this and super keywords.
 *	This keyword is used to call the current(child) class method, instance variable, and constructor.
 *	super keyword used to call immediate parent class method, instance variable, and constructor.
 *  COPYRIGHT (C) 2022 QDEV TECHNOLAB. All rights reserved.
 *  @author Neel
 *	@version 1.0.0
 */
class Animal {

	String color = "black";
	void eat() {
		System.out.println("eating");
	}

}
class Dog extends Animal {

	String color = "white";
	void eat() {
		System.out.println("eating bread");
	}
	void work() {
		System.out.println(super.color); //Super keyword used to call parent class instance variable.
		System.out.println(this.color); //This keyword used to call child(current) class instance variable. 
		super.eat(); //Super keyword used to invoke parent class method.
		this.eat(); //This keyword used to invoke child class method.
	}

}
class ThisSuperExample {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.work();
	}

}