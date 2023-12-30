package code_test;
import java.util.*;
public class TestQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> q1 = new PriorityQueue<Integer>();
		//Scanner sc =  new Scanner(System.in);
		q1.add(23);
		q1.add(16);
		q1.add(04);
		q1.add(26);
		
		System.out.println("Printing element of queue: "+ q1);
		
		System.out.println("head of queue: "+ q1.element());
		
		// to get the head first element similar to peekFirst()
		System.out.println("head of queue: "+ q1.peek());
		
		// to get the tail last element of queue peekLast() used in ArrayDeque
		
		//System.out.println("tail of queue: "+ q1.peekLast());
		
		
		// iterating the queue elements 
		
		System.out.println("Iterating the queue elements: ");
		
		Iterator<Integer> it= q1.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
			q1.remove();
			q1.poll();
			
			System.out.println("After removing two elements from queue: ");
			
			Iterator<Integer> it2 = q1.iterator();
			while(it.hasNext()) {
				System.out.println(it2.next());
			}
		

	}

}
