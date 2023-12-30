package com.java8features;

public class AnonymousInnerVsLambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// using anonymous inner class 
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
                        for(int i=0;i<5;i++) {
                        	System.out.println("child thread");
                        }
			}
			
		};
		r.run();  // calling run() method
		
		Thread t = new Thread();
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("Main thread");
		}
		
		// run() using lambda expression 
		
		Runnable r1 = () -> {
			       for(int i=0;i<5;i++) {
			    	   System.out.println("child thread");
			       }
		};
		r1.run();
		
		Thread t1 = new Thread();
		t1.start();
		for(int i=0;i<5;i++) {
			System.out.println("main thread");
		}
		
		// using lambda in another way 
		
		Thread t2 = new Thread(()-> {
			       for(int i=0;i<5;i++) {
			    	   System.out.println("child thread");
			       }
		});
        t2.start();
        
        for(int i=0;i<5;i++) {
	    	   System.out.println("main thread");
	       }
	}

}
