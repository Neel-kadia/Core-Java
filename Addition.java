/**
 *	This program is about the parameterized constructor.
 *	Passed two integer parameters and applied a mathematical formula
 *	COPYRIGHT (C) 2022 QDEV TECHNOLAB. All Rights Reserved.
 *	@author Neel
 *	@version 1.0.0
 */
class Add {

	int number3;
	// Created parameterized constructor.
	Add(int a, int b) {
		number3 = a + b; 
	}
	void display() {
		System.out.println(number3);
	}

}

public class Addition {

	public static void main(String[] args) {
		Add a1 = new Add(10, 20); // The constructor is invoked while creating an object of the Add class.
		a1.display();
	}

}