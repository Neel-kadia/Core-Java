import java.util.*;

/**
 *	program to demonstrate map concepts.
 *	COPYRIGHT (C) 2022 QDEV TECHNOLAB. All rights reserved.
 *	@author Neel
 *	@version 1.0.0
 */
public class Collection2 {

	public static void main(String[] args) {
		Map < Integer, String > map = new HashMap < Integer, String > (); //creating HashMap
		map.put(100, "Rahul"); //Adding data to HashMap in key-value pair
		map.put(101, "Ajay");
		map.put(102, "Amit");

		for (Map.Entry m: map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		String name = map.get(101);
		System.out.println("The name of id 101 is:- " + name);
	}

}