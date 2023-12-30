package com.faq.imp.program;

class Exceptmulticatch {
public static void main (String arg[]) {
try {
       int a = Integer.parseInt(arg[0]);
       int b = Integer.parseInt(arg[1]);
       int c = a/b;
       System.out.println("Result: "+c);
}
catch (ArithmeticException ae) {
        System.out.println("Enter second number except zero");
}
catch (ArrayIndexOutOfBoundsException ar) {
          System.out.println("Both numbers are required");
}
catch (NumberFormatException ne) {
           System.out.println("Enter only integer value");
}
finally {
           System.out.println("Finally block always execute");
}
}
}