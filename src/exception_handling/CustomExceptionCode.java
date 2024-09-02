package com.eception.handling.prg;

class NegativeRadiusException extends Exception {

	public NegativeRadiusException(String message) {
		super(message);
	}
}
class Circle {
	private double radius;

	public Circle(double radius) throws NegativeRadiusException{
		if(radius<=0) 
			throw new NegativeRadiusException("Invalid Radius"+radius);
		this.radius = radius;
	}
	public double getPerimeter() {
		return radius*2*Math.PI;
	}	
}
public class CustomExceptionCode {

	public static void main(String[] args) {

       Circle circle; // creating obj reference outside of try 
       try {
    	     circle = new Circle(4);
    	   System.out.println(circle.getPerimeter());
       }catch(NegativeRadiusException ne) {
    	   System.out.println(ne.getMessage());
       }
	}

}
