package com.faq.imp.program;

public class Strcompareall
{
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "java";
		String s5 = "aish";
		String s3 = "JAVA";
		String s4 = new String("java");
		
		// below 4 approach for string equals () method
		System.out.println(s1.equals(s2));  // true because content is smae
		System.out.println(s1.equals(s4));  // true because content is smae one string in scp && one string in heap or non pool
		System.out.println(s1.equals(s3)); // false .. content same but case is differ upper and lower.
		System.out.println(s1.equalsIgnoreCase(s3));  // true used equalsIgnoreCase() method neglecting upper & lower case letter
		
			// below 4 approach for string == () operator/method
		System.out.println(s1==s2);   // true bcaz s1 & s2 pointing to same object in scp
		System.out.println(s1==s4);  // flase bcaz s1 in scp memory & s4 in heap or non pool memrory poiting in different object 
		
		System.out.println(s1.compareTo(s2)); // 0 o/p ... bcaz s1 & s2 lexicorgraphically equal.
		System.out.println(s1.compareTo(s5)); // 1 o/p ..s1>s5   .. first > second string so positive integer output
		System.out.println(s5.compareTo(s1)); // -1 o/p ..s5>s1.. second >first string so negaative output 
		
	}
}