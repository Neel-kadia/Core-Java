import java.util.*;

/**
 *	Program to demonstrate comparator interface.
 *	Comparator provides multiple sorting sequences.
 *	COPYRIGHT (C) 2022 QDEV TECHNOLAB. All rights reserved.
 *	@author Neel
 *	@version 1.0.0
 */
class Student {

	int rollNo;
	String name;
	int age;

	Student(int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

}

class AgeComparator implements Comparator < Student > {

	public int compare(Student student1, Student student2) {
		if (student1.age == student2.age) {
			return 0;
		} else if (student1.age > student2.age) {
			return 1;
		} else {
			return -1;
		}
	}

}

class NameComparator implements Comparator < Student > {

	public int compare(Student student1, Student student2) {
		return student1.name.compareTo(student2.name);
	}

}

public class Collection4 {

	public static void main(String[] args) {
		ArrayList < Student > alStudent = new ArrayList < Student > ();
		alStudent.add(new Student(101, "Vijay", 23));
		alStudent.add(new Student(106, "Ajay", 27));
		alStudent.add(new Student(105, "jay", 21));

		System.out.println("sorting by name");   
		Collections.sort(alStudent, new NameComparator()); //Using NameComparator to sort the elements 
		for (Student studentObj: alStudent) {
			System.out.println(studentObj.rollNo + " " + studentObj.name + " " + studentObj.age);
		}

		System.out.println("sorting by age");
		Collections.sort(alStudent, new AgeComparator()); //Using AgeComparator to sort the elements
		for (Student studentObj: alStudent) {
			System.out.println(studentObj.rollNo + " " + studentObj.name + " " + studentObj.age);
		}
	}

}