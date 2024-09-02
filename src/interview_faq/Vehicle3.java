package com.faq.imp.program;

class Vehicle3 {
      Vehicle3() {
	  System.out.println("This is vehicle");
	  }}
	  
class Bikes extends Vehicle3 {
       Bikes() {
	   super();
	   System.out.println("This is Bike");
                 //  super();
	   }}
	   
	   class Soopercs {
	   public static void main (String arg []) {
	   Bikes honda = new Bikes();
	   }}