package com.collections.codingImp;

// define Node class
class Node {
	public int data;  // data stored in LL
	Node reference;  // reference to next node 
	
	// initial state node has null address
	public Node(int data) {
		this.data=data;
		this.reference=null;
	}
}

class Stack {
	private Node top; // reference to top most node 

	public Stack(Node top) {
		this.top = top;
	}
	
	
	public Stack() {
		// TODO Auto-generated constructor stub
	}

	// check stack is empty or not 
	
	public boolean isEmpty() {
		return top == null;
	}
	
	// push an element on to the stack 
	
	public void push(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			top = newNode;
		}else {
			newNode.reference = top;
			top = newNode;
		}
	}
	
	// pop an element from the stack 
	public int pop(){
		if(isEmpty()) {
			System.out.println("Stack is empty cannot pop element from the stack");
			return -1; //return a default value or throw exception
		}
		int popped = top.data;
		top = top.reference;
		return popped;
	}
	
	  // Peek at the topmost element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. No elements to peek.");
            return -1;   // Return a default value or throw an exception
        }
        return top.data;
    }
}
public class TestStackListIm {

	public static void main(String[] args) {

		Stack stack = new Stack();   // Create a new stack

        stack.push(10);              // Push elements onto the stack
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Is stack empty? " + stack.isEmpty());
	}

}
