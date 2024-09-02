package com.faq.imp.program;


// usage of toString() method 
class Strstudent{  
 int rollno;  
 String name;  
 String city;  
  
 Strstudent(int rollno, String name, String city){  
 this.rollno=rollno;  
 this.name=name;  
 this.city=city;  
 }  
   
 public String toString(){//overriding the toString() method  
  return rollno+" "+name+" "+city;  
 }  
 public static void main(String args[]){  
   Strstudent s1=new Strstudent(101,"Raj","lucknow");  
   Strstudent s2=new Strstudent(102,"Vijay","ghaziabad");  
     
   System.out.println(s1);   //compiler writes here s1.toString()  
   System.out.println(s2);  //compiler writes here s2.toString()  
 }  
}  




/*
In the above program, Java compiler internally calls toString() method, overriding this method will return the specified values of s1 and s2 objects of Student class.
*/


/*
java toString() theory concept
Java toString() Method
If you want to represent any object as a string, toString() method comes into existence.

The toString() method returns the String representation of the object.

If you print any object, Java compiler internally invokes the toString() method on the object. So overriding the toString() method, returns the desired output, it can be the state of an object etc. depending on your implementation.

Advantage of Java toString() method
By overriding the toString() method of the Object class, we can return values of the object, so we don't need to write much code.
*/