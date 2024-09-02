package com.eception.handling.prg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileCheckedEx {

	public static void main(String[] args) {
            // read the file and print each word of file
		try {
			File file = new File("C:\\Users\\Rushikesh Panchal\\Desktop\\mavenprog\\code_test\\src\\com\\eception\\handling\\prg\\data,txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line; //=null;
			while((line=br.readLine())!=null) {
				// seperate token of each 
				String tokens[]=line.split(" ");
				for(String token:tokens) {
					System.out.println(token);
				}
				//System.out.println(line);
			}
		}catch(FileNotFoundException fe) {
			//System.out.println("File is not found...");
		}catch(IOException iex) {
			System.out.println("Some Exceptions while processing the file");
		}
	}

}
