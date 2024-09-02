package com.java8features;
import java.util.TreeMap;
public class TestMapLambda {
	public static void main (String arg[]) {
      // natural descending order(custom sorting by Comprator Interface(SAMI or Fi) written() class logic 
	  TreeMap<Integer,String> map=new TreeMap<Integer,String>((obj1,obj2)->(obj1>obj2)?-1:(obj1<obj2)?+1:0);    
	  map.put(07,"Dhoni");    
	  map.put(33,"Gayle");    
	  map.put(01,"Rahul"); 
	  map.put(28,"Stokes");
	  System.out.println(map);
	}
	
}


/* TreeMap<Integer,String> map=new TreeMap<Integer,String>();
for natural sort order tree map 
map.put(07,"Dhoni");    
map.put(33,"Gayle");    
map.put(01,"Rahul"); 
map.put(28,"Stokes"); 
 
// TreeMap by default natural sort order provide 
System.out.println(map);*/