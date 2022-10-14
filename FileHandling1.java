import java.io.IOException; //Import the IOException class for handling errors 
import java.io.FileWriter; //Import the FileWriter class 

/**
 *	This program demonstrates file handling.
 *	Write the content into the text file using the FileWriter class.
 *	COPYRIGHT (C) 2022 QDEV TECHNOLAB. All rights reserved.
 *	@author Neel
 *	@version 1.0.0
 */
public class FileHandling1 {

	public static void main(String[] args) {
		try {
			FileWriter fileWrite = new FileWriter("C:\\Users\\om\\CoreJavaProgramme\\myTestFile.txt");
			fileWrite.write("Personal Information:\n"); //Write the content into the myTestFile.txt file
			fileWrite.write("Name: Neel kadia\n");
			fileWrite.write("Phone number: 1234567890\n");
			fileWrite.write("Email: abc@gmail.com\n");
			fileWrite.write("Study: java programming");
			fileWrite.close();  //Close the stream
			System.out.println("Content is successfully wrote to the file");
		} catch (IOException exception) {
			System.out.println("An unexpected error occurred");
			exception.printStackTrace();
		} 
	}

}