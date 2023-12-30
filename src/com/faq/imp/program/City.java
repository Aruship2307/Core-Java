package com.faq.imp.program;

class City {
      int num;
	  String name;
	   String state="Maharashtra";
	   
	  City (int n, String e){
	  num=n;
	  name=e;
}
      void display(){
	     System.out.println(num+" "+name+" "+state);
       }
	  
         public static void main(String arg []){
	         City n = new City(26,"Nanaded");
	         City p = new City(12,"Pune");
                  n.display();
                  p.display();
	  }
  }