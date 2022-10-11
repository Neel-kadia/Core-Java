/**
 *	program to handle exceptions using try, catch, and finally keywords.
 *	COPYRIGHT (C) 2022 QDEV TECHNOLAB. All rights reserved.
 *	@author Neel
 *	@version 1.0.0
 */
public class ExceptionExample {

	public static void main(String[] args) {
		try {
			System.out.println("inside code block");
			int data = 25 / 0; //throws divide by zero exception 
			System.out.println(data);
		} catch (ArithmeticException exceptionObj) { //handles the Arithmetic Exception / Divide by zero exception  
			System.out.println("Exception handled");
			System.out.println(exceptionObj);
		} finally { //executes regardless of exception occurred or not 
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code");
	}

}