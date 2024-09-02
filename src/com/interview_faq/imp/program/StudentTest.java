package com.faq.imp.program;

public class StudentTest {
	  public String msg;

	public static void main(String[] args) {

		StudentTest s1 = new StudentTest();
		s1.msg="Hello";
		StudentTest s2 = s1;
		s2.msg="World";

		System.out.println(s1.msg);   
		System.out.println(s2.msg);
	}

}
