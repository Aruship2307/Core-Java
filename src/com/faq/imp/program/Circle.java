package com.faq.imp.program;


class Operation {
      int square (int n)
     {
       return n*n;
     }
  }

class Circle{
    Operation op; // aggregation 
    double pi=3.14;

    void squareArea(int x){
         int resultSquare = op.square(x);
         System.out.println("Area of square="+resultSquare);
      }

    double area (int radius) {
        op= new Operation ();
        int square = op.square(radius); // code reusubility deligates the method call
        return pi*square;
      }
    
       public static void main (String arg []) {
          Circle c = new Circle();
          double result = c.area(5);
          c.squareArea(5);
           System.out.println("Area of circle="+result);
     }
}
