/**
 *	program to handle exceptions using throws keyword.
 *	COPYRIGHT (C) 2022 QDEV TECHNOLAB. All rights reserved.
 *	@author Neel
 *	@version 1.0.0
 */
class Test {

	public static int divideNum(int number1,int number2) throws ArithmeticException { //method with (two)integer parameters and throws exception
		int div = number1 / number2;
		return div; //return div
	}

}

public class ExceptionExample2 {

	public static void main(String[] args) {
		Test testObj = new Test(); //created object of Test class
		try {
			System.out.println(testObj.divideNum(45, 0)); //method called and passed (two)integer arguments
		} catch (ArithmeticException e) {
			System.out.println("number cannot be divide by 0");
		}
		System.out.println("rest of the code");
	}

}