package com.faq.imp.program;


import java.util.*;
public class Collectlinked {
public static void main (String arg [] ) {
LinkedList<String> al = new LinkedList<String>();
al.add(1,"avi");
al.add(3,"bro");
al.add(2,"catch");

Iterator <String> itr = al.iterator();
while(itr.hasNext()) {
System.out.println(itr.next());
}
}}