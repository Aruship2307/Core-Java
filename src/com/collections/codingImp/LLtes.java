package code_test;

import java.util.*;


// add elements in linked list

//https://www.youtube.com/watch?v=XcAALEmSt50    -->> railway project
public class LLtes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		     LinkedList<Integer> ll = new LinkedList<>();
		     ll.add(5);
		     ll.add(10);
		     ll.add(4);
		     ll.add(8);

		     // original linked list
		     System.out.println(ll);
		     
		     /*Iterator<Integer> it = ll.iterator();
		     
		     while (it.hasNext()) {
		    	 System.out.println(it.next());
		     }*/
		     
		     // After adding element at specific positions
		     
		     ll.add(2,9);
		     System.out.println(ll);
		     
		     // Adding second list element to end of the first list  by addAll -(Collection<? extends E> c)
		     
		     LinkedList<Integer> ll2 = new LinkedList<>();
		     
		     ll2.add(87);
		     ll2.add(82);
		     
		     ll.addAll(ll2);
		     
		     System.out.println(ll);
		     
		     // Adding third list at specific posn in first list
		     
		     LinkedList <Integer> ll3 = new LinkedList<>();
		     
		     ll3.add(74);
		     ll3.add(78);
		     ll3.add(72);
		     
		     ll.addAll(1,ll3);
		     
		     System.out.println(ll);
		     
		     // Adding element at starting start of list
		     
		     ll.addFirst(809);
		     System.out.println("Element added at by addFirst method: "+ll);
		     
		     ll.addLast(999);
		     System.out.println("Element added at by addLast method: "+ll);
	}

}
