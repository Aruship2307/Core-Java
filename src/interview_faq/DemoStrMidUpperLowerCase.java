package com.faq.imp.program;
// given string with two staements, make first part is lowercase and second part is uppercase
public class DemoStrMidUpperLowerCase {

	public static void main(String[] args) {

		String str = "This is clouddev website This is clouddev website";
		
		// to get mid point of the string
		
		int mid = str.length()/2;
		
		// declared two string to store uppercase and lowercase
		String lowerCase = "";
		String upperCase = "";
		
		for(int i=0;i<str.length();i++) {
			if(i<mid) {
				lowerCase = lowerCase + Character.toLowerCase(str.charAt(i));
			}else {
				upperCase = upperCase + Character.toUpperCase(str.charAt(i));
			}
		}
		System.out.println(lowerCase+upperCase);
	}

}
