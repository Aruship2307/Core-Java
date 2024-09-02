package com.faq.imp.program;

abstract class Car {
	  abstract void run();
	  
	  }
	  class Toyota extends Car {
	  void run () {
	  System.out.println("Car running at 150 Kmph");
	  }}
	  
	  class Abstest {
	  public static void main (String arg []) {
	  Car obj = new Toyota();
	  obj.run();
	  }}