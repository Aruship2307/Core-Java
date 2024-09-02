package com.faq.imp.program;

import java.util.Scanner;
class MyCalculators {

    long power(int p, int n) throws Exception{
        if(p<0 || n<0) {
            throw new Exception ("n or p should not be negative.");
        }
        else if (p==0 || n==0) {
            throw new Exception ("n and p should not be zero.");
        }
        else
        return (long) Math.pow(n,p);
    }
    
}

public class Hackerthrowsth {
    public static final MyCalculators my_calculator = new MyCalculators();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}