package com.java8features;
// no parameter lambda expressions

@FunctionalInterface
interface Drawable {
	public void draw();
}

public class TestLambda1 {
	public static void main(String[] args) {
     int width=12; 
     
   //with lambda  
     Drawable d=()->{  
         System.out.println("Drawing "+width);  
     };  
     d.draw();  
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
