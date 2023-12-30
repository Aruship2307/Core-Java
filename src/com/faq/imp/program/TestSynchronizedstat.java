package com.faq.imp.program;


class Table123 {
	
synchronized static void printTable (int n) {
         for(int i=1;i<=10;i++) {
       System.out.println(n*i);
   try {
       Thread.sleep(400);
       } catch(Exception e) {
         System.out.println(e);
      }
   }
 }
}

 class MyThread123 extends Thread {
        public void run () {
       Table123.printTable(1);
   }
}
 
class MyThread131 extends Thread {
     public void run() {
     Table123.printTable(10);
    }
}


public class TestSynchronizedstat {
    public static void main (String arg [] ) {
      MyThread123 t1 = new MyThread123();
      MyThread131 t2 = new MyThread131();
       t1.start();
       t2.start();
   }
}