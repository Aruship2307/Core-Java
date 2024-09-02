package com.java8features;
import java.util.function.Supplier;
import java.util.Date;

public class TestSupplierEx {

	public static void main(String[] args) {
		
       Supplier<Date> s=()->new Date();
       
       // returns current date and time from system
       System.out.println("Returns current date and time");
       System.out.println(s.get());
       
       // to generate some of the random name
       System.out.println("To generate some random names: ");
       Supplier<String> s2= ()-> {
       String [] s1 = {"Dhoni","Virat","Rohit","Hardik","Bumrah","Sachin"};
       int x = (int) (Math.random()*4); // 0.99*4 = 3.6 // int 0 to 3 num genrate to display
       return s1[x];
	};
	
	System.out.println(s2.get());
	System.out.println(s2.get());
	System.out.println(s2.get());
	System.out.println(s2.get());
	System.out.println(s2.get());
	System.out.println(s2.get());
	System.out.println(s2.get());
	System.out.println(s2.get());

	// to generate random OTP for bank application 
	 System.out.println();
     System.out.println("To generate some random otp: ");
	Supplier<String > s3 = ()-> {
		String otp="";
		for(int i=0;i<6;i++){      // 6 digit of otp 
			otp = otp+(int) (Math.random()*9); // 0 to 9 numbers will get generate=otp contains
		}
		return otp;
	};
	System.out.println(s3.get());
	System.out.println(s3.get());
	System.out.println(s3.get());
	System.out.println(s3.get());
	System.out.println(s3.get());
	System.out.println(s3.get());
	System.out.println(s3.get());
	
//rule pw = length 8 chars, 2,4,6,8 only digits , 1,3,5,7 places only uppercase,sp chars #,&,*,@
     System.out.println("\nTo generate some random passwors: "); // A1@3b9k7
     
     Supplier<String> s4 = () -> {
    	 
     Supplier<Integer> d = ()->(int)(Math.random()*10);
     String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#%&*";
   	 Supplier<Character> c = ()->symbols.charAt((int) Math.random()*29);
     String pwd = "";
     
    	 for(int i=0;i<8;i++){
    		 // for even num places
    		 if(i%2==0){
    			 pwd = pwd+d.get();
    		 }else{
    			 pwd=pwd+c.get();
    		 }
    	 }
    	 return pwd;
     };
 	System.out.println(s4.get());
 	System.out.println(s4.get());
 	System.out.println(s4.get());
 	System.out.println(s4.get());
 	System.out.println(s4.get());
 	System.out.println(s4.get());


}

}
