package com.faq.imp.program;


class Stbcap {
	   public static void main (String arg [] ) {
	     StringBuffer sb = new StringBuffer();
	   System.out.println(sb.capacity()); // default 16
	   sb.append("Hello to Java");  // hello content is lies from 0 to 16 ranges
	   System.out.println(sb.capacity()); // now 16
	   sb.append("Java is my favourite language");
	   System.out.println(sb.capacity()); // now(16*2)+2=34 ..i.e (old capacity*2)+2
	   }}