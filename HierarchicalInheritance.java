/**
 *	This program demonstrates hierarchical inheritance.
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
		System.out.println("barking...");
	}

}

class Cat extends Animal {

	void meow() {
		System.out.println("meowing...");
	}

}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Dog dogObj = new Dog();
		dogObj.bark();
		dogObj.eat();
		Cat catObj = new Cat();
		catObj.meow();
		catObj.eat();
	}

}