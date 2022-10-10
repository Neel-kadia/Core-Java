import java.util.Scanner;
/**
 *	This program calculates your EMI.
 *	The principal amount, rate, and time getting from the users and calculate EMI.
 *  COPYRIGHT (C) 2022 QDEV TECHNOLAB. All rights reserved.
 *  @author Neel
 *	@version 1.0.0
 */
class EmiCalculation {

	double emi;
	EmiCalculation(double p, double r, double t) { //parameterized constructor
		emi = (p * r * Math.pow(1 + r, t)) / (Math.pow(1 + r, t)-1); 
	}

}

class Emi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double principal;
		double rate;
		double time;
		double emi;
		System.out.print("Enter principal amount : ");
		principal = sc.nextFloat(); //Getting a principal amount from the user
		System.out.print("Enter rate : ");
		rate = sc.nextFloat();  //Getting a rate from the user 
		System.out.print("Enter time in year : ");
		time = sc.nextFloat(); //Getting time from the user 
		rate = rate / (12 * 100);
		time = time * 12;
		EmiCalculation emiObj = new EmiCalculation(principal,rate,time); //called parameterized constructor
		System.out.println("Emi is = " + emiObj.emi);
	}

}