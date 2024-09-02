package com.java8features;
// no parameter lambda expressions

interface Drawable {
	public void draw();
	
}

public class TestLambda1 {
	public static void main(String[] args) {     
   
	Drawable d1 = () -> System.out.println("invoked draw by lambda");
	d1.draw();


	}
}

/*
without lambda, Drawable implementation using anonymous class  
Drawable d=new Drawable(){  
    public void draw(){System.out.println("Drawing "+width);}  
};  
d.draw();  
// (argument-list) -> {body} -- Syntax of lambda expressions
}  */
