package com.faq.imp.program;

import java.util.*;
class Streplace  {
      public static void main (String arg[]) {
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter any string");
	  String s1=s.nextLine();
	  System.out.println("Given string is: "+s1);
	  int spcount=0,i,newlen,len;
	  len=s1.length();
	
	  char ch [] = s1.toCharArray();
	    for(i=0;i<len;i++) {
		if(ch[i]==' ') {
	   spcount++;
	   }
	   }
	     newlen=len+2*spcount;
	char [] chn = new char [newlen];
	for(i=len-1;i>=0;i--) {
	if(ch[i]==' ') {
	chn[newlen-1]='0';
	chn[newlen-2]='2';
	chn[newlen-3]='%';
	newlen=newlen-3;
	}
	else
	{
	chn[newlen-1]=ch[i];
	newlen=newlen-1;
	}
	}
	System.out.println("Updated string is: "+String.valueOf(chn));
	}}