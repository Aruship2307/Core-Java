package com.faq.imp.program;


class Bike {
      double price;
	  float weight;
	  String name;
	  int life; // in years expected life
	  
	  Bike(double price, float weight, String name,int life)
	  {
	  this.price=price;
	  this.weight=weight;
	  this.name=name;
	  this.life=life;
	  }
	  
	  void show()
	  {
	  System.out.println(price+" "+weight+" "+name+" "+life);
	  }
	  
	  public static void main (String arg []) {
	  Bike shine = new Bike(95000.00d,80.20f,"Shine",20);
	  Bike glamour = new Bike(80000.00d, 91.10f,"Glamour",15);
	  Bike pulsar = new Bike(99000.00d,85.20f,"Pulsar-150",12);
	  shine.show();
	  glamour.show();
	  pulsar.show();
	  }}