package code_test;
import java.util.*;

public class DemoPriorityQueue {

	public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<String>();
        pq.add("holder");
        pq.add("maxwell");
        pq.add("duminy");
        pq.add("Hyden");
        pq.add("gayle");
        pq.add("Anderson");
        pq.add("stokes");
        
        //retrieved not remove but throw ex
        System.out.println("Head: "+pq.element());
        
        // retrieved not remove, return null
        System.out.println("Head: "+pq.peek());
        
        Iterator<String> itr = pq.iterator();
        
        while(itr.hasNext()) {
        	System.out.println(""+itr.next());
        }
        
        //remove from head, throw ex if empty
        System.out.println("Retrieving queue elements: "+pq.remove());
      //remove from head, return null if empty
        System.out.println("Retrieving queue elements: "+pq.poll());
		
	}

}
