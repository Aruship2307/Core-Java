package com.faq.imp.program;
import java.io.*;
import java.util.*;

public class Strpalindromehak{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int i=0,len;
        String B="";
        String A=sc.next();
        len = A.length();
        for(i=len-1;i>=0;i--)
        {
            B = B + A.charAt(i);
        }
            if(A.equals(B))
            System.out.println("Yes");
            else
            System.out.println("No");
    }
}