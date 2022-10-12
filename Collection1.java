import java.util.*;

/**
 *	program to prepare the list and remove duplicate values of the list.
 *	COPYRIGHT (C) 2022 QDEV TECHNOLAB. All rights reserved.
 *	@author Neel
 *	@version 1.0.0
 */
public class Collection1 {

	public static void main(String[] args) {
		HashSet < String > set = new HashSet < String > (); //Creating HashSet
		set.add("A"); //Adding object in HashSet
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("A");
		set.add("C");
		set.add("E");
		set.add("E");
		set.add("E");

		Iterator < String > itr = set.iterator(); //getting the iterator
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}