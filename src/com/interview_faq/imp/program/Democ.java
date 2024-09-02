package com.faq.imp.program;

class Democ {
int a ;

static void get (int a){
System.out.println(a);
}

void add (int a){
System.out.println(a);
}

public static void main (String arg []) {
  Democ.get(5);
  Democ d = new Democ();
  d.add(6);
  }
}