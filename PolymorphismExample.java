/**
 *	This program demonstrates compile-time polymorphism.
 *	method overloading is an example of compile-time polymorphism.
 *	COPYRIGHT (C) 2022 QDEV TECHNOLAB. All rights reserved.
 *	@author Neel
 *	@version 1.0.0
 */
class Test {

	public int add(int a, int b) { //(integer) return type method with two (integer type) parameters
		return a + b;
	}
	public double add(double a, double b) { //(double) return type method with two (double type) parameters
		return a + b;
	}
	public int add(int a, int b, int c) { //(integer) return type method with three (integer type) parameters
		return a + b + c;
	}
	public double add(double a) { //double return type method with single (double type) parameter
		return a + a;
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