package com.faq.imp.program;

//String is given str = "a1b2c3" then seprate digit and sum them 
public class Strdigitsseperats {

	public static void main(String[] args) {

	    String str = "a1b2c3";
        int sum = 0;
        
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                int digit = Character.getNumericValue(c);
                sum += digit;
            }
        }
        
        System.out.println("Separated digits: ");
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                System.out.print(c + " ");
            }
        }
        
        System.out.println("\nSum of digits: " + sum);
	}

}
