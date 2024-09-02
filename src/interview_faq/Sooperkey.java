package com.faq.imp.program;

abstract class GrandParent {
	abstract void display();
}
class Parent1 extends GrandParent {	// Can we remove the abstract keyword from here?
	void display() {          //final void displayInParent() {  final void InParentdisplay()
		System.out.println("In Parent");
	}
}

class Child1 extends Parent1 {
	void display() {
		System.out.println("Child completes Parent and GrandParent");
		//super.display(); // super will invoke after parent class method 
	}
}

final class GrandChild extends Child1 {
	void display() {
	    //super.display(); // child class method will invoke first then grand child will invoke
		System.out.println("In GrandChild");
		super.display();   // child class will invoke after grandchild method invokes 
	}
}

//Uncomment the code given below and observe
//class GreatGrandChild extends GrandChild { }		    

public class Sooperkey {
	public static void main(String[] args) {
		new GrandChild().display();
	}
}