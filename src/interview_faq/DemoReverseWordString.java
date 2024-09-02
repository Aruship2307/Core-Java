package com.faq.imp.program;

public class DemoReverseWordString {

	public static void main(String[] args) {

		String s = "Software Developer working in Startup PayTm"; // original string 
		
		//String [] words = s.split(" ");  //   spliting string
		
		// reverse a given string 
		
		String rev_s="";
		
		int len=s.length();
		
		for(int i=len-1;i>=0;i--) {
			rev_s=rev_s+s.charAt(i);
		}
		System.out.println(rev_s);

		// second approach by stringbuilder class
		
       String str = "Coding is Passion"; // original string 
		
		String [] words2 = str.split(" ");  //   spliting string
		
		String rev_words="";
		
		for(String w:words2) {
			StringBuilder sb = new StringBuilder(w);// coding
			sb.reverse();  // gnidoC
			
			rev_words=rev_words+sb.toString()+" ";  // gnidoC si noissaP
		}
		System.out.println(rev_words);
	}
}
