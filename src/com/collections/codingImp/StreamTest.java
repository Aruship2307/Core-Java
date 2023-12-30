package code_test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class StreamTest {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<>();
		
		al.add(50);
		al.add(20);
		al.add(35);
		al.add(41);
		al.add(16);
		
		List<Integer> alnew = new ArrayList<>();
		
		alnew = al.stream().filter(x-> x>20).collect(Collectors.toList());
		
		//System.out.println(alnew);
		System.out.println("Result by stream filter");
		alnew.stream().forEach(x->System.out.println(x));
		
		System.out.println("Result by stream map");
		al.stream().filter(i->i>20).map(i->i*i).forEach(x->System.out.println(x));

	}

}
