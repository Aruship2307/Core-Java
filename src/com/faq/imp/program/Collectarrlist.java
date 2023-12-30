package com.faq.imp.program;

import java.util.*;
class Collectarrlist {
      public static void main (String arg[]) {
	  ArrayList<Integer> al = new ArrayList<Integer>();
	  al.add(2);
	  al.add(4);
	  al.add(6);
	  al.add(8);
	  
	  Iterator itr = al.iterator();
	  while(itr.hasNext()) {
	  System.out.println(itr.next());
	  }
	  }}