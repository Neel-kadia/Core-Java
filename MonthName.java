/**
	This Programme is About To Check Month Name From Month Number.
	COPYRIGHT (C) 2022 QDEV TECHNOLAB. All Rights Reserved.
	@version 1.0.0
*/
public class MonthName{

	public static void main(String[] args){
		int MonthNumber = 9;	// Initialize The Month Number to check The Month Name.
		switch(MonthNumber){
			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("February");
				break;
			case 3:
				System.out.println("March");
				break;
			case 4:
				System.out.println("April");
				break;
			case 5:
				System.out.println("May");
				break;
			case 6:
				System.out.println("June");
				break;
			case 7:
				System.out.println("July");
				break;
			case 8:
				System.out.println("August");
				break;
			case 9:
				System.out.println("September");
				break;
			case 10:
				System.out.println("October");
				break;
			case 11:
				System.out.println("November");
				break;
			case 12:
				System.out.println("December");
				break;	
			default :
				System.out.println("Invalid Month Number");
		}
	}

}
	