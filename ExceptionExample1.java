/**
 *	program to handle exceptions using the throw keyword.
 *	COPYRIGHT (C) 2022 QDEV TECHNOLAB. All rights reserved.
 *	@author Neel
 *	@version 1.0.0
 */
class Test {

	public static void checkNum(int num) { //method with an integer parameter
		if (num < 1) {
			throw new ArithmeticException("number is negative,cannot calculate square");
		} else {
			System.out.println("square of" + num + "is" + (num * num));
		}
	}

}

public class ExceptionExample1 {

	public static void main(String[] args) {
		Test testObj = new Test(); //created object of Test class
		testObj.checkNum(-3); //method with an integer argument
		System.out.println("rest of the code..");
	}

}