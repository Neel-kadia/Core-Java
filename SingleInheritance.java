/**
 *	This Program demonstrates single inheritance.
 *	COPYRIGHT (C) 2022 QDEV TECHNOLAB. All rights reserved.
 *	@author Neel
 *	@version 1.0.0
 */
class Animal { //super class or parent class

	void eat() {
		System.out.println("eating...");
	}

}
class Dog extends Animal { //sub class or child class

	void bark() {
		System.out.println("barking...");
	}

}
public class SingleInheritance {

	public static void main(String[] args) {
		Dog dogObj = new Dog(); //created object of dog class 
		dogObj.bark(); // called bark method using object of dog class
		dogObj.eat(); // called eat method using object of dog class
	}

}