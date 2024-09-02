package com.faq.imp.program;


class MyThread extends Thread {
	
      public void run()
	  {
	    System.out.println("Shut down hook task completed");
	  }
}

	  public class Thshutdown {
	             public static void main (String arg [] ) throws Exception {
	            	 
	  Runtime r = Runtime.getRuntime();
	  r.addShutdownHook (new MyThread());
	  
	  System.out.println("Now main is sleeping ...press ctrl+c to exit");
	  try {
	  Thread.sleep(300);
	  }catch (Exception e) { }
	  }
}