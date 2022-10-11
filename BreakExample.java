/**
 *	This program is about continuing and breaking statements.
 *	When for loop is running then check the condition if the value of a is equal to 4 then continue the program
 *	and if the value of a is equal to 7 then break the program.
 *	COPYRIGHT (C) 2022 QDEV TECHNOLAB. All Rights Reserved.
 *	@author Neel
 *	@version 1.0.0
 */

public class BreakExample {

	public static void main(String[] args) {
		for(int a = 1; a <= 10; a++) {
			if(a == 4) {
				continue; // if value of a is equal to 4 then continue the program 
			}
			if(a == 7) {
				break; // if value of a is equal to 7 then break the program 
			}
			System.out.println(a);
		}
	}

}