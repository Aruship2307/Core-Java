package com.faq.imp.program;
import java.util.Scanner;

public class Hackerstringintro {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int i=0,j=0,flag=0,lex,tl;
        
        tl = A.length()+B.length();
        
        System.out.println(tl);
        
        lex = A.compareTo(B);
       
        if(lex < 0)
        System.out.println("No");
        else
        System.out.println("Yes");
        // get first letter of string 
        String acap = A.substring(0,1);
        // get remainig letter of string 
        String ast =  A.substring(1);
        // converted first letter into captial
        acap = acap.toUpperCase();
        // concatinating to string 
        String first = acap+ast;
        
        String bcap = B.substring(0,1);
        String bst = B.substring(1);
        bcap = bcap.toUpperCase();
        // concatinating to string 
        String second = bcap+bst;
        
        System.out.println(first + " " + second);
    }
}



