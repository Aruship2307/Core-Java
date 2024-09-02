package com.faq.imp.program;

class First11 {
  //  final void show() { 
	// final void show() in super class not able to extends method
     void show() {       
	   System.out.println("Parent class method");
	   }}
	   
class Second11 extends First11 {
        void show() {                         // final void show() in super class not able to extends method
		System.out.println("Child class block");
		}}
		
class Usefinal {
      public static void main (String arg []) {
 // method can't override when we make any method is final
	  Second11 o = new Second11();
                 // Second11 k = new First11();  // downcasting 
                  First11 m = new Second11();  // upcasting ... parent class ref var to call child class object .
	  m.show();
	  }}