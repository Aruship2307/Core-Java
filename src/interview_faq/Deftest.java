package com.faq.imp.program;
class Bmain {
       void show() {
        System.out.println("This is parent class method");
    }
}
class Ssub extends Bmain {
    void get() {
        System.out.println("This is child class method accessing into the sub class");
    }
}

class Tsub extends Ssub{
    void msg() {
    System.out.println("This is second child class method accessing into the Tsub class");
}}
public class Deftest
{
  
	public static void main(String[] args) {
		Tsub obj = new Tsub ();
	
		// method will call as per order, which method I call first that will invoke it and print that statement
		obj.show();  
		obj.get();
		obj.msg();
	}
}