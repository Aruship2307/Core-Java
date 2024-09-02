package com.faq.imp.program;
// super() keyword it is responsible to call parent class constructor
class Vehicle2 {
      Vehicle2() {
	  System.out.println("This is vehicle");
	  }}
	  
class Bike2 extends Vehicle2 {
       Bike2() {
	   super();
	   System.out.println("This is Bike");
                 //  super();
	   }}
	   
	   class Sooperc {
	   public static void main (String arg []) {
	   Bike2 honda = new Bike2();
	   
	   }}