package com.faq.imp.program;

class Arithmetic {
      int a,b;
	  int add(int a, int b) {
	  return a+b;
	  }}
	 
class Adder extends Arithmetic {
}	 
public class HackerInhert {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    System.out.println("My superclass is: Arithmetic");
	Adder obj = new Adder();
	int Result1=obj.add(20,22);
	int Result2=obj.add(5,8);
    int Result3=obj.add(8,12); 
    System.out.println(Result1+" "+Result2+" "+Result3);
	}
}