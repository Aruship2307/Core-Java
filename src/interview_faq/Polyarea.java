package com.faq.imp.program;

class Base {
      double s;
      double area(double s) {
	  this.s=s;
	  return s*s;
	  }}
	  
class Square extends Base {
      double s;
	  double area(double s) {
	  this.s=s;
	  return s*s;
	  }}
	
class Circles extends Base {
      double s;
      double area (double s) {
      double pi=3.14;	
      return pi*s*s;
	  }}
	  
class Polyarea {
      public static void main (String arg [] ) {
    Circles c = new Circles();
	 double resultc= c.area(5.5);
	 Square s = new Square();
	 double results = s.area(6.5);
	 System.out.println("Area of circle "+resultc);
	 System.out.println("Area of square "+results);
	 }}
	  
	  