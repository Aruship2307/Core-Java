package com.faq.imp.program;


  class Parent{
         int age=29;
	     String name="Ravi";
	  }
   
    class Child extends Parent {
    	
       float weight=65.36f;
	   float height=5.8f;
	   
          public static void main (String arg [] ) {
            Child c = new Child ();
		System.out.println(c.age+" "+c.name+" "+c.weight+" "+c.height);
		}
  }