import java.util.*;

/**
 *	program to add string values in the list and print all the values using an iterator.
 *	COPYRIGHT (C) 2022 QDEV TECHNOLAB. All rights reserved.
 *	@author Neel
 *	@version 1.0.0
 */
public class Collection {

	public static void main(String[] args) {
		ArrayList < String > list = new ArrayList < String > (); //Creating ArrayList
		list.add("Hello"); //Adding object in ArrayList 
		list.add("World");
		list.add("Neel");

		Iterator < String > itr = list.iterator(); //getting the iterator 
		while (itr.hasNext()) { //check if the iterator has the element 
			System.out.println(itr.next()); //printing the element and moving to next
		}
	}

}