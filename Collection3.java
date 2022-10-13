import java.util.*;

/**
 *	Program to demonstrate comparable interface.
 *	Comparable provides a single sorting sequence.
 *	COPYRIGHT (C) 2022 QDEV TECHNOLAB. All rights reserved.
 *	@author Neel
 *	@version 1.0.0
 */
class Student implements Comparable < Student > { //Creating a class that implements a Comparable Interface

	int rollNo;
	String name;
	int age;

	Student(int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Student studentObj) {
		if (age == studentObj.age) {
			return 0;
		} else if (age > studentObj.age) {
			return 1;
		} else {
			return -1;
		}
	}

}

public class Collection3 {

	public static void main(String[] args) {
		ArrayList < Student > alStudent = new ArrayList < Student > ();
		alStudent.add(new Student(101, "Vijay", 23));
		alStudent.add(new Student(106, "Ajay" , 27));
		alStudent.add(new Student(105, "Jay", 21));

		Collections.sort(alStudent);
		for (Student studentObj: alStudent) {
			System.out.println(studentObj.rollNo + " " + studentObj.name + " " + studentObj.age);
		}
	}

}