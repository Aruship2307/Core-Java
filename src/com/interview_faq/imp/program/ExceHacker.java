package com.faq.imp.program;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ExceHacker {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
           try {
               
               int x,y,z;
               x=sc.nextInt();
               y=sc.nextInt();
               sc.close();
               System.out.println(x/y);
           } 
           catch (InputMismatchException ie) {
               System.out.println("java.util.InputMismatchException");
           }catch(Exception e) {
               System.out.println(e);
           }
           }
    }

/*
Exception handling is the process of responding to the occurrence, during computation, of exceptions – anomalous or exceptional conditions requiring special processing – often changing the normal flow of program execution. (Wikipedia)

Java has built-in mechanism to handle exceptions. Using the try statement we can test a block of code for errors. The catch block contains the code that says what to do if exception occurs.

This problem will test your knowledge on try-catch block.

You will be given two integers  and  as input, you have to compute . If  and  are not  bit signed integers or if  is zero, exception will occur and you have to report it. Read sample Input/Output to know what to report in case of exceptions.*/