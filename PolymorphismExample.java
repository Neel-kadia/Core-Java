/**
 *	This program demonstrates compile-time polymorphism.
 *	method overloading is an example of compile-time polymorphism.
 *	COPYRIGHT (C) 2022 QDEV TECHNOLAB. All rights reserved.
 *	@author Neel
 *	@version 1.0.0
 */
class Test {

	public int add(int number1, int number2) { //(integer) return type method with two (integer type) parameters
		return number1 + number2;
	}
	public double add(double number1, double number2) { //(double) return type method with two (double type) parameters
		return number1 + number2;
	}
	public int add(int number1, int number2, int number3) { //(integer) return type method with three (integer type) parameters
		return number1 + number2 + number3;
	}
	public double add(double number1) { //double return type method with single (double type) parameter
		return number1 + number1;
	}

}

public class PolymorphismExample {

	public static void main(String[] args) {
		Test testObj = new Test(); //instance of test class
		System.out.println(testObj.add(2, 3)); //passed two arguments of integer type 
		System.out.println(testObj.add(2.0, 3.0)); //passed two arguments of double type
		System.out.println(testObj.add(5, 5, 5)); //passed three arguments of integer type
		System.out.println(testObj.add(5.0)); //passed single argument of double type
	}

}