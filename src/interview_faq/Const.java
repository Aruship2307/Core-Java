package com.faq.imp.program;

class Const {
       int a;
        String name;
        
      void get (Const o){
	        System.out.println("Method called by this and argument");
           System.out.println(a+" "+name);
	  }
	  Const(int a, String name){
	  get(this); // prints 0 and nulll
                  this.a=a;
                  this.name=name;
                //  get(this);   // it prints method passed argument
	  }
                 
	  public static void main (String arg []) {
	  Const o = new Const (5,"JAVA");
           o.get(null);      
	  }
}
	   