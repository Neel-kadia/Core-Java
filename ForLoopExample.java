/**
	This Programme is About to Print Star Pattern Using For Loop.
	COPYRIGHT (C) 2022 QDEV TECHNOLAB. All Rights Reserved.
	@version 1.0.0
*/
public class ForLoopExample{

	public static void main(String[] args){
		for(int a = 1;a <= 5;a++){		// Initialization ; Condition ; Increment
			for(int b = 1;b <= a;b++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}