package code_test;
import java.util.*;
import java.util.Iterator;
import java.util.Map.Entry;
// testmap 1 and testmap 2 ...send it to personal github 
public class TestMap2 {

	public static void main(String[] args) {
		
		    // LinkedHashMap extends AbstractMap, HashMap implements Map
			LinkedHashMap<Integer,String> hm = new LinkedHashMap<Integer,String>(); 
			hm.put(22,"java");
			hm.put(20,"python");
			hm.put(24,"aws");
			hm.put(23,"react");
			hm.put(21,"git");
			
			// remove method in the map 
			System.out.println("before removing map: "+hm.entrySet());
			hm.remove(20);
			System.out.println("After removing map: "+hm.entrySet());
 
			// replace method map as per key
			System.out.println("before replace map is: "+hm.entrySet());
			hm.replace(21, "github");
			System.out.println("after replace map is: "+hm.entrySet());
			
			// replace method map as per key & old value changed to new values
			System.out.println("before replace map is: "+hm.entrySet());
			hm.replace(24, "aws", "aws-cloud");
			System.out.println("after replace map is: "+hm.entrySet());
		
			// fetching keys inside map 
			System.out.println("All keys in a map: "+hm.keySet());
			
			// fetching values inside map 
			System.out.println("All Values in map: "+hm.values());
			
          // iterating map values by 
			System.out.println("displaying map key-value pair list by for each: ");
			
			for(Map.Entry mt:hm.entrySet()) {
				System.out.println("Key: "+mt.getKey()+" = Value: "+mt.getValue());
		} 
			// getting key list by for each ..similarly we can create for values us String in this case 
			System.out.println("displaying map key list by for each: ");
			for(Integer key:hm.keySet()){
				System.out.println(key);
			}
			
			// create an object of iterator == key-value mapping
			Iterator <Entry<Integer,String>>  it = hm.entrySet().iterator();
			
			// iterate through key-value mappings 
			System.out.println("displaying map key-value pair list by Iterator interface: ");
			while(it.hasNext()){
				System.out.println(it.next());
			}
			
			// create an object of iterator == for fetching keys only 
			Iterator <Integer> it1 = hm.keySet().iterator();
			System.out.println("key list by Iterator interface: ");
			
			while(it1.hasNext()){
				System.out.println(it1.next());
			}
			
			// create an object of iterator == for fetching values only 
			Iterator <String> it2 = hm.values().iterator();
			System.out.println("Value list by Iterator interface: ");
			
			while(it2.hasNext()){
				System.out.println(it2.next());
			}
	}

}
