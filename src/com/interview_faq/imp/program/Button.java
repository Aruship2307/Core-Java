package com.faq.imp.program;


class Button {
      int size;
	  String color;
	  
	  Button(int size, String color)
	  {
	  this.size=size;
	  this.color=color;
	  System.out.println(size+" "+color);
	  }
	  
	  void click ()
	  {
	  System.out.println("Either button is single or double click working");
	  }
	  
	  void blinking()
	  {
		System.out.println("when button is pressed backlight will blink as per user choice");
	  }
 public static void main (String arg []) {
      Button black = new Button(5,"Black");
	  black.click();
	  black.blinking();
	  
	  Button red = new Button (8,"Red");
	   red.click();
	  red.blinking();
	  }
 }