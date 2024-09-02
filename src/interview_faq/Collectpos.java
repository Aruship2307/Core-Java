package com.faq.imp.program;
import java.util.*;

public class Collectpos {
       public static void main (String arg [] ) {
    LinkedList<String> al = new LinkedList<String>();
    al.add("avi");
    al.add("bro");
    al.add(2,"catch");

  Iterator <String> itr = al.iterator();
  
  
  while(itr.hasNext()) {
     System.out.println(itr.next());
   }
  }
}