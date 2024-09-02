package com.faq.imp.program;


import java.util.*;
class Studentc {
int rollno;
String name;
int age;
Studentc(int rollno, String name, int age) {
this.rollno=rollno;
this.name=name;
this.age=age;
}
}
public class Collectlist {
public static void main (String arg []) {
Studentc s1 = new Studentc(101,"Ravi",23);
Studentc s2 = new Studentc(102,"Raju",25);
Studentc s3 = new Studentc(103,"Rushi",24);

ArrayList<Studentc> al = new ArrayList<Studentc>();
al.add(s1);
al.add(s2);
al.add(s3);

Iterator itr = al.iterator();

while(itr.hasNext()) {
Studentc st = (Studentc)itr.next();
System.out.println(st.rollno+" "+st.name+" "+st.age);
}
}
}