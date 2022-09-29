/**
	This Programme is About To Check Your Age
	COPYRIGHT (C) 2022 QDEV TECHNOLAB. All Rights Reserved.
	@version 1.0.0
*/
public class CheckAge{

	public static void main(String[] args){
		int age = 26;    // Initialize Your Age
		if(age < 10){
			System.out.println("Your Age Is Less Than 10 Years.");
		}
		else if(age >= 10 && age <= 25){
			System.out.println("Your Age Is Between 10 to 25 Years.");
		}
		else if(age > 25 && age < 50){
			System.out.println("Your Age Is Between 26 to 50 Years.");
		}
		else{
			System.out.println("Your Age Is Above 50 Years.");
		}
	}

}