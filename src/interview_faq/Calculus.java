package com.faq.imp.program;
import java.util.*;


class Calculus {
    static int square (int id)
    {
        return id*id;
    }
    
    public static void main (String arg []) {
    	
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter any number");
        
        int id=s.nextInt();
        int save = Calculus.square(id);
        
        System.out.println("Given number square is "+save);
    }
}