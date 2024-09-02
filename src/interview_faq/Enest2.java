package com.faq.imp.program;

import java.util.Scanner;

class Enest2 {
    public static void main(String arg[]) {
        try {
            System.out.println("Performing arithmetic operation");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any num");
            int b = sc.nextInt();
            int c = b / 0;  // This line will throw ArithmeticException
        } catch (ArithmeticException ec) {
            System.out.println(ec);
            System.out.println("Enter non-zero value");
        }

        try {
            int a[] = new int[5];
            a[10] = 25;  // This line will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("Enter array num at a valid position");
        }
    }
}
