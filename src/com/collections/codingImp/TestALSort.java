package code_test;
import java.util.*;

// comparator is a Functional Interface
/*class CustomSort implements Comparator<Integer> {

	@Override
	public int compare(Integer obj1, Integer obj2) {
		if(obj1>obj2) {
			return -1;
		}
		else if(obj1<obj2) {
			return 1;
		}
		else {
			return 0;
		}
		
		// OR by using ternary operation
		return (obj1>obj2)?-1:(obj1<obj2)?+1:0;
	}
	
}*/
public class TestALSort {

	public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
		
		// Collections.sort(al); is not for TreeSet Interface-- pass comparator as argument- Chk HS
	//TreeSet<Integer>  al = new TreeSet<Integer>(new CustomSort()); // if we want sorting order go with TreeSet
	al.add(23);
	al.add(19);
	al.add(28);
	al.add(5);
	al.add(31);
	
	System.out.println("before natural sorting: "+al);
	
	Collections.sort(al);
	
	System.out.println("After natural sorting: "+al);
	
	// Customized sorting by Comparator interface .. descending order 
	// below code replace CustomSort class logic by Java8 Functional Interface and Lambda expressions
	Collections.sort(al,((obj1,obj2)->(obj1>obj2)?-1:(obj2<obj1)?+1:0));

	//Collections.sort(al, new CustomSort());
	
	System.out.println("Customized sorting: "+al);

	}

}

// Custom sort class code will replace below code .Functional Interface & lambda comes don't need to write sep class logic 
// Collections.sort(al,((obj1,obj2)->(obj1>obj2)?-1:(obj2<obj1)?+1:0);