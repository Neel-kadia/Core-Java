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
	Add(int number1, int number2) {
		number3 = number1 + number2; 
	}
	void display() {
		System.out.println(number3);
	}

}

public class Addition {

	public static void main(String[] args) {
		Add addObj = new Add(10, 20); // The constructor is invoked while creating an object of the Add class.
		addObj.display();
	}

}