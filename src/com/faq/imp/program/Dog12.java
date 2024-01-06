package com.faq.imp.program;


abstract class Animal{
    public String name;
    public int numLegs;
    public abstract void speak();
    public abstract void eat();

    public static void main(String[] args){
       Dog12 myDog = new Dog12();
       myDog.speak();
       myDog.eat();
    }
}


public class Dog12 extends Animal{
    public void speak() {
    System.out.println("woof");
    }
   public  void eat() {
        System.out.println("num num");
    
   }
    public static void main(String[] args){
        Dog12 myDog = new Dog12();
        myDog.speak();
        myDog.eat();
    }
}