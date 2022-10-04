/**
 *	This program is about string methods
 *	like charAt(), length(), substring(), equals(), isEmpty(), concat(), replace(), toUpperCase(), toLowerCase(),trim().
 *  COPYRIGHT (C) 2022 QDEV TECHNOLAB. All rights reserved.
 *  @author Neel
 *	@version 1.0.0
 */
class StringExample {

	public static void main(String[] args) {
		String name = "javaprogramming";
		String name1 = "javaprogramming";
		String name3 = " java  ";
		System.out.println(name.charAt(4)); //charAt(): it returns the char value for the 4th index.
		System.out.println(name.length()); //length(): it returns string length.
		System.out.println(name.substring(2,5)); //substring(): it returns substring for given begin index(here 2) and end index(here 5).
		System.out.println(name.equals(name1)); //equals(): it checks the equality of string with the given object.(name and name1).
		System.out.println(name.isEmpty()); // isEmpty(): it checks if the string is empty.
		System.out.println(name.concat(name1)); //concat(): it concatenates the specified string.
		System.out.println(name.replace('j','k')); //replace(): it replaces all occurrences of the specified CharSequence.
		System.out.println(name.toUpperCase()); //toUpperCase(): it returns a string in uppercase. 
		System.out.println(name.toLowerCase()); //toLowerCase(): it returns a string in lowercase.
		System.out.println(name3.trim()); //trim(): it removes beginning and ending spaces of this string.
	}

}