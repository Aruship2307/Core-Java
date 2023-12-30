package com.faq.imp.program;

public class Addl {
    private int num1;
    
    // parameterized constructor
    public Addl(int num1) {
        System.out.println("Parameterized");
        this.num1 = num1;
        
    }
    // Method to add two objects;
    public Addl computeSum(Addl obj1) {
        this.num1+= obj1.num1;
        return this;
    }
    // Accessor method to read num1 instance variable's value
    public int getNum() {
        return num1;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Addl obj1 = new Addl(10);  // obj1.num1 = 10  obj1 = this;
        Addl obj2 = new Addl(20); // obj2.num1 =  20
        
        System.out.println(obj1.computeSum(obj2));  
    }
}