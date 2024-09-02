package com.faq.imp.program;
import java.io.IOException;

class Threxcept {
	
		void m () throws IOException {
		throw new IOException("device error");
		}
		
		 void n() throws IOException{
		 m();
		 }
		 
		 void p () {
		 try {
		 n();
		 } catch(Exception e){
		 System.out.println("Exception handled");
		 }
	}
		 
	public static void main (String arg [] ){
		
		 Threxcept obj = new Threxcept ();
		 obj.p();
		 System.out.println("Normal flow");
	 }
}