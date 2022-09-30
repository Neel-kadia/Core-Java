/**
 *		This programme is about checking your age.
 *	If your age is less than 10 years then print the text "Your age is less than 10 years".
 *		If your age is greater than 10 and less than or equals to 25 then print the text "Your age is between 10 to 25 years".
 *	If your age is greater than 25 and less than 50 then print the text "Your age is between 26 to 50 years".
 *		@author Neel
 *	COPYRIGHT (C) 2022 QDEV TECHNOLAB. All rights reserved.
 *		@version 1.0.0
 */
public class CheckAge{

	public static void main(String[] args) {
		int age = 23;    // Initialize your age
		if(age < 10) {
			System.out.println("Your age is less than 10 years.");
		} else if (age >= 10 && age <= 25) {
			System.out.println("Your age is between 10 to 25 years.");
		} else if (age > 25 && age < 50) {
			System.out.println("Your age is between 26 to 50 years.");
		} else {
			System.out.println("Your age is above 50 years.");
		}
	}

}