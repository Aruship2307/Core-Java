package com.multithreading.prg;
// creating custom thread 

class UserThread extends Thread {
	// run method has task to run the thread 
	public void run() {
		System.out.println("this is user defined thread...Inside Main");
	}
}


public class ThreadMethodsDemo{

	public static void main(String[] args) {
		
		System.out.println("program started..");
		
		int sum=0,x=100;
		sum= x+x;
		
		System.out.println("Sum is: "+sum);
		// checking the current on which main is running
		
		Thread t = Thread.currentThread();
		
		String tname = t.getName();
		
		System.out.println("Currently running thread is: "+tname);
		
		// changing main method name as per custom naming
		
		 t.setName("CustomMainThread");
		 
		 System.out.println("Updated thread name: "+t.getName());
		 
		 //check id of thread

		 System.out.println("ID of new thread is: "+t.getId());
		 
		 try {
			 Thread.sleep(1000);
		 }catch(Exception e) {
			 
		 }
		 
		 System.out.println("Program ended...");
		 
		 // creating object UserThread
		 
		 UserThread thread = new UserThread();
		// thread.run();  //method invoke or call method by obj ref 
		 
		 thread.start();  // it is starting thread
		 
		 
		 
	}

}
