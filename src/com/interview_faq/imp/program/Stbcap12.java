package com.faq.imp.program;

class Stbcap12 {
	   public static void main (String arg [] ) {
	     StringBuilder sb = new StringBuilder();
	   System.out.println(sb.capacity()); // default 16
	   sb.append("Hello");  // hello content is lies from 0 to 16 ranges
	   System.out.println(sb.capacity()); // now 16
	   sb.append("Java is my favourite language");
	   System.out.println(sb.capacity()); // now(16*2)+2=34 ..i.e (old capacity*2)+2
	   sb.ensureCapacity(10); // now no change
	   System.out.println(sb.capacity());  // now 34
	   sb.ensureCapacity(50);
	   System.out.println(sb.capacity());  //now by 50.. print 70 (old capacity*2)+2 = (34*2)+2= 70.
	   }}