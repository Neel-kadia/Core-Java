/**
 *	This program demonstrates runtime polymorphism.
 *	method overriding is an example of runtime polymorphism.
 *	COPYRIGHT (C) 2022 QDEV TECHNOLAB. All rights reserved.
 *	@author Neel
 *	@version 1.0.0
 */
class Bank {

	float getRateOfInterest() {
		return 0;
	}

}

class Sbi extends Bank { //Sbi class extends bank class

	float getRateOfInterest() {
		return 8.4F;
	}

}

class Icici extends Bank { //Icici class extends bank class 

	float getRateOfInterest() {
		return 7.3F;
	}

}

class Axis extends Bank { //Axis class extends bank class 

	float getRateOfInterest() {
		return 9.7F;
	}

}

public class PolymorphismExample1 {

	public static void main(String[] args) {
		Bank bankObj;
		bankObj = new Sbi(); 
		System.out.println("Sbi rate of interest: " + bankObj.getRateOfInterest()); //called getRateOfInterest() method of class Sbi
		bankObj = new Icici();
		System.out.println("Icici rate of interest: " + bankObj.getRateOfInterest()); //called getRateOfInterest() method of class Icici
		bankObj = new Axis();
		System.out.println("Axis rate of interest: " + bankObj.getRateOfInterest()); //called getRateOfInterest() method of class Axis 
	}

}