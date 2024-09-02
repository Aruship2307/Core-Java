package com.faq.imp.program;

public class Emixcat
{
	public static void main(String[] args) {
		try {
		    int arr [] = new int [5];
		    arr[15]=50/0;  
		} catch(ArithmeticException e) {
		    System.out.println("Task 1 is completed");  // 50/0 ..then task 1 will execute
		} 
		catch (ArrayIndexOutOfBoundsException e1) {
		    System.out.println("Task 2 is completed");  //arr[6]..more than five task 2 will execute
		}
		catch (Exception e) {
		    System.out.println("common task completed");
		}
		System.out.println("rest of the code...");
	}
}
