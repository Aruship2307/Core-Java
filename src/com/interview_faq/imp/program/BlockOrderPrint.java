package com.faq.imp.program;

class BlockOrderPrint {
    static {
	   System.out.println(" static block");   // firs print -> when class is loaded into class loader
	   }
    
	   {
	   System.out.println(" initializer block"); // second print
	   }
	   
	   BlockOrderPrint () {
	   System.out.println("constructor");   // third print -> when we create object by default constructor that time it will call
	   }
	   public static void main (String arg [] ) {
		   BlockOrderPrint o = new BlockOrderPrint();
	   }
}
