package com.faq.imp.program;

interface Ac {
void a();
void b();
void c();
void d();
}

abstract class Bc implements Ac {
public void c() {
      System.out.println("I am c in abstarct");
}}

class Mc extends Bc {
public void a() {
      System.out.println("I am A");
}

public void b() {
      System.out.println("I am B");
}
public void d() {
      System.out.println("I am D ");
}}

class Testin {
      public static void main (String arg [] ) {
      Bc o = new Mc();
      o.a();
      o.b();
      o.d();
}}