package code_test;

import java.util.*;
public class HackerAL {

	public static void main(String[] args) {
		
		   Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt(); // no of integers
	        
	       
	       ArrayList[] al = new ArrayList[20000];
	       
	       for(int i=0;i<n;i++){
	           al[i] = new ArrayList();
	           int d=sc.nextInt();
	           for(int j=0;j<d;j++){
	               int value=sc.nextInt();
	               al[i].add(value);
	           }
	       }

	       // no of queries 
	      int q = sc.nextInt();
	      
	      for(int i=0;i<q;i++){
	          int row = sc.nextInt();
	          int col = sc.nextInt();
	         try {
	             System.out.println(al[row-1].get(col-1));
	      }catch(Exception e){
	          System.out.println("ERROR!");
	      }       
	    

	}

}
}
