package com.faq.imp.program;


class Table12 {
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
class MyThread12 extends Thread {
public void run () {
Table12.printTable(1);
}
}
class MyThread13 extends Thread {
public void run() {
Table12.printTable(10);
}
}
public class TestSynchornizedstat {
public static void main (String arg [] ) {
MyThread12 t1 = new MyThread12();
MyThread13 t2 = new MyThread13();
t1.start();
t2.start();
}
}