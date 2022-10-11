import java.util.Scanner;

/**
 *	This program calculates your EMI.
 *	The principal amount, rate, and time getting from the users and calculate EMI.
 *	COPYRIGHT (C) 2022 QDEV TECHNOLAB. All rights reserved.
 *	@author Neel
 *	@version 1.0.0
 */
class EmiCalculation {

	double emi;
	EmiCalculation(double principal, double rate, double time) { //parameterized constructor
		emi = (principal * rate * Math.pow(1 + rate, time)) / (Math.pow(1 + rate, time)-1); 
	}

}

class Emi {

	public static void main(String[] args) {
		Scanner scannerObj = new Scanner(System.in);
		double principal;
		double rate;
		double time;
		double emi;
		System.out.print("Enter principal amount : ");
		principal = scannerObj.nextFloat(); //Getting a principal amount from the user
		System.out.print("Enter rate : ");
		rate = scannerObj.nextFloat();  //Getting a rate from the user 
		System.out.print("Enter time in year : ");
		time = scannerObj.nextFloat(); //Getting time from the user 
		rate = rate / (12 * 100);
		time = time * 12;
		EmiCalculation emiObj = new EmiCalculation(principal,rate,time); //called parameterized constructor
		System.out.println("Emi is = " + emiObj.emi);
	}

}