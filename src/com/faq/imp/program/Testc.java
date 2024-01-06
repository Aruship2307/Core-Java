package com.faq.imp.program;


class C {
       C() {
           System.out.println("parent constructor");
     	   }
      
	       {
             System.out.println("parent Initializer block");
	       }
	}
class D extends C {
	   D() {
	  super();
	       System.out.println("child constructor");
	       }
	      {
          System.out.println("child Initializer block");
	      }
	}
class Testc {
       public static void main ( String arg [] ){
	   D d = new D();
	   }}