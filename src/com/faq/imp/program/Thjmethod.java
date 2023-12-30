package com.faq.imp.program;

// after one thread join () method will work 
class Thjmethod extends Thread {
      public void run () {
	  for(int i=1;i<5;i++) {
	  try {
	  Thread.sleep(500); // time set for 500 mili seconds
	  }
	  catch (InterruptedException e ) {
	  System.out.println(e);
	  }
	  System.out.println(i);
	  }
 }
	  public static void main (String arg [] ) {
		  
	   Thmethod t1 = new Thmethod();
	   Thmethod t2 = new Thmethod();
       Thmethod t3 = new Thmethod();
       
           t1.start();  // t1.run ()
           try {
               t1.join();
                } catch(Exception e ){
                 System.out.println(e);
                }
                 t2.start();   
	             t3.start();   
	 }
}