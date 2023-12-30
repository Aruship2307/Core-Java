package com.collections.codingImp;
// Reverse the given linkedlist by 1) Iterative Algorithm Imlementation 2) Recursive Algorithm Implemntation

class Nodes{
	 int data;
	 Nodes next;
	
	Nodes(int data){
		this.data = data;
		this.next = null;  
	}
}

class LinkedList{
	Nodes head;
	
	public LinkedList(){
		this.head=null;
	}
	
	// method to add a new node at the end of the linkedlist
	
	public void addNode(int data) {
		Nodes newNode = new Nodes(data);
		if(head == null) {
			head = newNode;
		} else {
			Nodes temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		System.out.println();
	}
	
	// method tp reverse the linkedlist 
	
	public void reverseList() {
		Nodes prev = null;
		Nodes current = head;
		Nodes next = null;
		
		while(current!= null) {
			next = current.next;
			current.next=prev;
			prev = current;
			current = next;
		}
		head = prev;
	}

	public void printList() {
		// TODO Auto-generated method stub
		
	}
}


public class ReverseLinkedList {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);

        System.out.println("Original Linked List:");
        list.printList();

        list.reverseList();

        System.out.println("Reversed Linked List:");
        list.printList();
	}

}
