package com.faq.imp.program;

class Ra  {
     final  int a;
     final static int b;
      Ra () {
	   a=50;
	  System.out.println("Value in constrcutor a:"+a);
	  }
        static {
                 b=90;
                 System.out.println("Value in static block b: "+b);
                 }}
	   class Testk {
	   public static void main (String arg []) {
	   Ra obj = new Ra ();
	  // obj.show();
	   }}