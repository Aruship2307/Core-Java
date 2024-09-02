package com.faq.imp.program;

public class Strtoint {

	public static void main(String[] args) {
		String s = "2310";
		int i = Integer.parseInt(s);
		
		System.out.println("Converted given string to int:"+"i "+i);
	}}

// about parseInt concatenation and addition priority 

/*
 * //Java Program to understand the working of string concatenation operator
 * public class StringToIntExample{ public static void main(String args[]){
 * //Declaring String variable String s="200"; //Converting String into int
 * using Integer.parseInt() int i=Integer.parseInt(s);
 * System.out.println(s+100);//200100, because "200"+100, here + is a string
 * concatenation operator System.out.println(i+100);//300, because 200+100, here
 * + is a binary plus operator }}
 */  
