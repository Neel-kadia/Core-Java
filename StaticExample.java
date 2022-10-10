/**
 *	This program demonstrates the static variable, static method, and static block.
 *	static variable: static variable gets memory only once in the class area at the time of class loading. 
 *	static method: static method invoked without creating an instance of a class.
 *	static block: executed before the main method at the time of class loading.
 *  COPYRIGHT (C) 2022 QDEV TECHNOLAB. All rights reserved.
 *  @author Neel
 *	@version 1.0.0
 */
class Student {

	int rollNo; //Instance variable
	String name;
	static String college = "ITS"; //Static variable
	Student(int r, String n) { //Parameterized constructor
		rollNo = r;
		name = n;
	}
	static void change() { //Static method
		college = "MIS"; 
	}
	void display() {
		System.out.println(rollNo + " " + name + " " + college);
	}
	static { //Static block executed before the main method at the time of class loading.
		System.out.println("Static block is invoke.");
	}

}
public class StaticExample {

	public static void main(String[] args) {
		Student studentObj = new Student(101, "Rahul");
		studentObj.display();
		Student student1Obj = new Student(102, "raj");
		student1Obj.display();
		Student.change(); //called static method without creating an object of student class.
		Student student2Obj = new Student(103, "Rahi");
		student2Obj.display();
		Student student3Obj = new Student(104, "Rom");
		student3Obj.display();
	}

}