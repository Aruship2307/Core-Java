package com.faq.imp.program;
import java.io.*;

	class M {
		 public void method () throws IOException{
		 throw new IOException ("device error");
		 }
	}
		public class Thrmain {
		        public static void main (String arg []) {
		           try{
		            M m = new M();
		            m.method();
                    }catch (Exception e) {
                     System.out.println("Exception handled");
                      }
                     System.out.println("Normal flow will executed");
	 }
}