package filesInJava;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Optician {

	
	public void demoMtdToReadFile() throws IOException {
		
		//Create a file in a computer
		File file = new File("glasses.txt");
		file.createNewFile();
		
		//Write data into file
		FileWriter filewriter = new FileWriter(file);
		filewriter.write("Rayban \n Gucci \n Levis \n");
		filewriter.flush();
		filewriter.close();
		
		//Read data 
		FileReader filereader = new FileReader(file);
		char[] charArrays = new char[50];
		filereader.read(charArrays);
		
		for (char charArray : charArrays) {
			System.out.println(charArray);
		}
		
		filereader.close();
	}
	
}