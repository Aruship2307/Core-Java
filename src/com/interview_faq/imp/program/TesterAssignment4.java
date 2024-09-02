package com.faq.imp.program;

class Rectangle {
    private float length,width;
    public Rectangle() {
        
    }
    public Rectangle(float length, float width) {
          this.length=length;
          this.width=width;
    }
    
  public  double calculateArea() {
        double area = length*width;
        return Math.round(area*100.0)/100d;
    }
   public double calculatePerimeter(){
        double perimeter = 2*(length+width);
        return Math.round(perimeter*100.0)/100d;
    }
}

class TesterAssignment4 {

	public static void main(String args[]) {
		
		Rectangle rectangle=new Rectangle(12f,5f);
		System.out.println("Area= "+rectangle.calculateArea());
		System.out.println("Perimeter= "+rectangle.calculatePerimeter());
	}

}