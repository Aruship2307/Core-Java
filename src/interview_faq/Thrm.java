package com.faq.imp.program;
import java.io.*;

class M1 {
	void method () throws IOException{
		 //throws new IOException ("device error");
		 }
}

public class Thrm{
		 public static void main (String arg []) {
		 try{
		     M1 m = new M1();
		     m.method();
           }catch ( IOException e) {
              System.out.println("Exception handled");
           }
              System.out.println("Normal flow will executed");
	}
}