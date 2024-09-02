package com.faq.imp.program;

import java.util.*;
// find each duplicate characters in a String like "programming"..r,g,m.
class Strduplicatesingle  {
	public static void main(String arg[]) {
		Scanner s = new Scanner(System.in);
		int count=1,i,j,len;
		System.out.println("Enter a string:");
		String str = s.nextLine();
		char ch [] = str.toCharArray();
		len=ch.length;
		
		System.out.println("Duplicate characters in the given string: ");
		for(i=0;i<len;i++){
			count=1;
			for(j=i+1;j<len;j++)
			{
				if(ch[i]==ch[j] && ch[i]!= ' ')
				{
					count++;
					ch[j]=0;
				}
			}
			if(count > 1 && ch[i]!=0)
			{
				System.out.print(ch[i]+" ");
			}
		}
	}
}