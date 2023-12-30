package code_test;
import java.util.*;

public class TestSet {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<>();
		hs.add(51);
		hs.add(54);
		hs.add(55);
		hs.add(52);
		hs.add(51);
		hs.add(59);
		hs.add(56);
		
		/*it will add only one null values
		 * hs.add(null);
		hs.add(null);*/
		
		// contains elements or not 
		hs.contains(59);
		System.out.println("Check given elements contains or not: "+hs);
		
		// create iterator object and iterate the set view 
		
		System.out.println("using iterator interface: ");
		Iterator<Integer>  it =  hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
