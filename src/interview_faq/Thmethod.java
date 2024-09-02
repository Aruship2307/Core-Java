package com.faq.imp.program;

// at a time only one thread execute 
class Thmethod extends Thread {
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
                 t1.run();
                 t2.run();   //  don't used sleep  .. in sgle stacks
	  t1.start();   //  leep used stored in 2 differ stack
	  t2.start();
	  }
}