package com.faq.imp.program;

class Cons {
     int a;
	 Cons (int x) {
	 a=x;
	 System.out.println(a);
	 }
	 
	 void show (){
	 System.out.println(a);
	 }
	 
	 public static void main (String arg [] ) {
	 Cons c = new Cons (5);
	 c.show();
   }
}