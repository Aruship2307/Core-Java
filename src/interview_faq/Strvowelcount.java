package com.faq.imp.program;


import java.util.*;
public class Strvowelcount { 
    public static void main(String args[]) { 
        System.out.println("Please enter some text"); 
        Scanner reader = new Scanner(System.in); 
        String input = reader.nextLine(); 
        char[] letters = input.toCharArray(); 
        int count = 0; 
        for (char c : letters) 
        {
            switch (c)
        { 
            case 'a':
            case 'e':
            case 'i': 
            case 'o':
            case 'u': 
               count++; 
            break; 
            //no count incrment
            default: 
            // can count consonent also
            } 
            
        } 
            System.out.println("Number of vowels in String [" + input + "] is : " + count); 
        
    } }

