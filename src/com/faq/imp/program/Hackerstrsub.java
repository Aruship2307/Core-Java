package com.faq.imp.program;
import java.util.Scanner;

public class Hackerstrsub {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
	        String ss = S.substring(start,end);
			System.out.println(ss);
	    //    System.out.println(S.substring(start,end));
		
    }
}
