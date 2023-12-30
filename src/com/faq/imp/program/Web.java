package com.faq.imp.program;


class Web {
      Web ()
	  {
	  System.out.println("This is constructor");
	  }
	  
	  {
	  System.out.println("This is initializer block");
	  }
	   static
	   {
	   System.out.println("This is static block");
	   }
	   public static void main (String arg [])
	   {
	   Web  w = new Web();
	   }}