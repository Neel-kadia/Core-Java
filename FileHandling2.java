import java.io.File; //Import a File class 
import java.util.Scanner; //Import the Scanner class for reading text files 
import java.io.FileNotFoundException; //Import FileNotFoundException class for handling errors 

/**
 *	This program demonstrates file handling.
 *	Read a text file using the scanner class.
 *	COPYRIGHT (C) 2022 QDEV TECHNOLAB. All rights reserved.
 *	@author Neel
 *	@version 1.0.0
 */
public class FileHandling2 {

	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\om\\CoreJavaProgramme\\myTestFile.txt"); //Create file object of the file to read data 
			Scanner dataReader = new Scanner(file);
			while (dataReader.hasNextLine()) {
				String fileData = dataReader.nextLine();
				System.out.println(fileData);
			}
			dataReader.close();
		} catch (FileNotFoundException exception) {
			System.out.println("An unexcepted error occurred!");
			exception.printStackTrace();
		}
	}

}