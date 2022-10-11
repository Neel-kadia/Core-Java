/**
 *	This program demonstrates multilevel inheritance.
 *	COPYRIGHT (C) 2022 QDEV TECHNOLAB. All rights reserved.
 *	@author Neel
 *	@version 1.0.0
 */
class Animal {

	void eat() {
		System.out.println("eating...");
	}
	
}

class Dog extends Animal {

	void bark() {
		System.out.println("barking");
	}

}

class BabyDog extends Dog {

	void weep() {
		System.out.println("weeping...");
	}

}

public class MultilevelInheritance {

	public static void main(String[] args) {
		BabyDog babyDogObj = new BabyDog();
		babyDogObj.weep();
		babyDogObj.bark();
		babyDogObj.eat();
	}

}