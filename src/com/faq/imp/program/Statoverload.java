package com.faq.imp.program;
// can we overload statics method = yes
public class Statoverload{
    public static void talk()
    {
          System.out.println("hello there!");
    }

    public static void talk(String name) {
             System.out.println("Hello"+" "+name);
       } 

    public static void main(String[] args)
    {
          talk();           // this is default static method ...stop when say overload with name
          talk("Matthew");  // this is parameterized static method
    }
}