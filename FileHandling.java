import java.io.File; //Import File class
import java.io.IOException; //Import the IOException class for handling errors

/**
 *	This program demonstrates file handling.
 *	Create a text file using file handling.
 *	COPYRIGHT (C) 2022 QDEV TECHNOLAB. All rights reserved.
 *	@author Neel
 *	@version 1.0.0
 */
public class FileHandling {

	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\om\\CoreJavaProgramme\\myTestFile.txt");  //Create an object of a file 
			if (file.createNewFile()) {
				System.out.println("File " + file.getName() + " is created successfully");
			} else {
				System.out.println("The file already exists in the directory");
			}
		} catch (IOException exception) {
			System.out.println("An unexpected error occurred ");
			exception.printStackTrace();
		}
	}

}