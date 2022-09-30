/**
 *	This programme is about to print star pattern using for loop.
 *	COPYRIGHT (C) 2022 QDEV TECHNOLAB. All rights reserved.
 *  @author Neel
 *	@version 1.0.0
 */
public class ForLoopExample {

	public static void main(String[] args) {
		for (int a = 1;a <= 5;a++) { // Initialization ; Condition ; Increment
			for (int b = 1;b <= a;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}