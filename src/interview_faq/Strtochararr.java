package com.faq.imp.program;
  
public class Strtochararr {
  
    public static void main(String args[])
    {
        String str = "GeeksForGeeks";  // for naive approach charAt method
       
       String arr = "OracleDatabase"; // for toChar array method 
   
        // Creating array of string length
        char[] ch = new char[str.length()];
  
        // Copy character by character into array and print char array using naive approach
        System.out.println(" \nMethod -1 naive approach charAt method");
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
               System.out.print(ch[i]+"");
        }
             System.out.println("Method -2 toCharArray method");
        // creating and storing array by tochararray method 
        char ch1 [] = arr.toCharArray();

          for(int j=0; j<arr.length(); j++) {
              System.out.print(ch1[j]);
           }

          /* for (int i = 0; i < str.length(); i++){
               System.out.println(ch[i]);
           }*/
  
        // Printing content of array
       /* for (char c : ch) {
            System.out.println(c);
        }*/
    }
}