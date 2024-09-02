package com.multithreading.prg;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializaionDemo {

	public static void main(String[] args) {
      Student1 s1 = new Student1();
      s1.num = 23;
      s1.str = "Rushikesh";
      
      String fileName = "C:\\Users\\Rushikesh Panchal\\Desktop\\csvfiles\\TestFile.txt";
      try {
    	  FileOutputStream fos = new FileOutputStream(fileName);  // file is ready for in write mode to write/update data
    	  ObjectOutputStream oos = new ObjectOutputStream(fos);   
    	  oos.writeObject(s1);    //s1 java obj converted into stream
    	  oos.close();
    	  fos.close();
    	  System.out.println("Object are successfully saved into file. ");
      }catch(FileNotFoundException fe) {
    	  fe.printStackTrace();
      }catch (IOException e) {
    	  e.printStackTrace();
		// TODO: handle exception
	}
	}

}
