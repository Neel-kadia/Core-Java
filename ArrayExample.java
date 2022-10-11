/**
 *	This program finds the index of an array element.
 *	This program demonstrates an array.
 *	an array is a collection of similar types of elements.
 *	COPYRIGHT (C) 2022 QDEV TECHNOLAB. All rights reserved.
 *	@author Neel
 *	@version 1.0.0
 */
public class ArrayExample {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5}; //Initialize array  
		System.out.println("Elements of given array");
		for (int a = 0; a < arr.length; a++) { //Loop through the array by incrementing the value of a 
			System.out.println("index number " + a + "= " + arr[a]);
		}
		String[] stringArr = new String[] {"Hello","How","are","you"}; //Initialize array
		for (int b = 0; b < stringArr.length; b++) { //Loop through the array by incrementing the value of b  
			System.out.println("index number " + b + "= " + stringArr[b]);
		}
	}

}