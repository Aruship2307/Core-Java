package code_test;
import java.util.*;

public class LLremethod {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		
		ll.add("Mrunal");
		ll.add("Aish");
		ll.add("Avi");
		ll.add("Rushi");
		ll.add("Mrunal");
		ll.add("Avi");
		ll.add("radha");
		ll.add("Aish");
		ll.add("Dikshant");
		ll.add("Mac");
		ll.add("Saurabh'");
		ll.add("Mac");
		
		
		
		System.out.println("Given List is: "+ll);
		
		// removing specific elemetn from list at specific posn 
		
		ll.remove(1);
		System.out.println("After remove element at posn List is: "+ll);
		
        ll.remove("Rushi");
        System.out.println("After remove specific element List is: "+ll);
        
        // creating second list
        
        LinkedList<String> ll2 = new LinkedList<>();
        
        ll2.add("JAVA");
        ll2.add("DSA");

        
        ll.addAll(ll2);
        
        System.out.println("Updated list is: "+ll);
        
        // removing all the newly added elements from the linkedlist
        ll.removeAll(ll2);
        
        System.out.println("After removing new element from list is: "+ll);
        
        ll.removeFirst(); 
        System.out.println("Removing the first element: "+ll);
        
        ll.removeLast();
        System.out.println("Removing the Last element: "+ll);
       
        //undefined type error means the spell u might going with wrong
        
        // removing first occurance from the list
        ll.removeFirstOccurrence("Avi");
        System.out.println("Removing first occurance from the list: "+ll);
       
        // removing last occurrence from the list
        ll.removeLastOccurrence("Mac");
        System.out.println("Removing last occurance from the list: "+ll);

        
       //  removing all elements from the list 
        ll.clear();
        
        System.out.println("Remving all elements from list: "+ll);
        
	}

}
