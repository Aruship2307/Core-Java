package com.faq.imp.program;

class Dreturn {
	
      int get (){
       int a = 5;
      return a;
     }
      
    void show (){
    int result = get ();
    System.out.println("Value of get method = "+result);
    }
    
public static void main (String V []) {
       Dreturn d = new Dreturn ();
       d.show();
    }
}

 