/**
 *	This program demonstrates encapsulation.
 *	Encapsulation is a way to achieve data hiding.
 *	setting values through the setter method and getting values through the getter method.
 *  COPYRIGHT (C) 2022 QDEV TECHNOLAB. All rights reserved.
 *  @author Neel
 *	@version 1.0.0
 */
class Account {

	private long accNo; //private data member
	private String name;
	private String email;
	private float amount;
	public long getAccNo() { //getter method
		return accNo;
	}
	public void setAccNo(long accNo) { //setter method
		this.accNo = accNo;
	}
	public String getName() { //getter method
		return name;
	}
	public void setName(String name) { //setter method
		this.name = name;
	}
	public String getEmail() { //getter method
		return email;
	}
	public void setEmail(String email) { //setter method
		this.email = email;
	}
	public float getAmount() { //getter method
		return amount;
	}
	public void setAmount(float amount) { //setter method
		this.amount = amount;
	}

}

public class EncapsulationExample {

	public static void main(String[] args) {
		Account acc = new Account(); //creating instance of Account class
		acc.setAccNo(22210165986L); //setting values through the setter method
		acc.setName("Rahul");
		acc.setEmail("rahul@gmail.com");
		acc.setAmount(10000F);
		System.out.println(acc.getAccNo() + " " + acc.getName() + " " + acc.getEmail() + " " + acc.getAmount()); //getting values through the getter methods
	}

}