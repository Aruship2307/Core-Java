package com.faq.imp.program;

public class ThreadGroupDemo implements Runnable {
	
       public void run () {
	   System.out.println(Thread.currentThread().getName());
	   }
       
	   public static void main (String arg [] ) {
		   
	   ThreadGroupDemo r1 = new ThreadGroupDemo();
	   ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");
	   Thread t1 = new Thread (tg1,r1,"one");
	   t1.start();
	   Thread t2 = new Thread (tg1,r1,"two");  // if ref not taken new threadgroupdemo(),"one");
	   t2.start();
	   Thread t3 = new Thread(tg1,r1,"three");
                   t3.start();
	   System.out.println("Thread Group Name: "+ tg1.getName());
	   tg1.list();
	   }
}