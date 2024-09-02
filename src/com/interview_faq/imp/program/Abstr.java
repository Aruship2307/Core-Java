package com.faq.imp.program;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
 class Abstwo extends Book {
    void setTitle(String s) {
        System.out.println("This is child class string: "+s);
    }
}
public class Abstr
{
	public static void main(String[] args) {
	    Abstwo o = new Abstwo();
	    o.setTitle("Aish");
	
	}
}