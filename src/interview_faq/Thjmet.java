package com.faq.imp.program;

// after one thread join () method will work 
class Thjmet extends Thread {
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
		  
	  Thjmet t1 = new Thjmet();
	  Thjmet t2 = new Thjmet();
      Thjmet t3 = new Thjmet();
      
          t1.start();  // t1.run ()
            try {
            t1.join(500);   // after t1 join wait for 500 milisec 
             } catch(Exception e ){
                System.out.println(e);
                }
                 t2.start();   
	             t3.start();   
	  }
}