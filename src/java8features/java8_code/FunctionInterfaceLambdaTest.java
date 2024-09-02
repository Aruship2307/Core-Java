package com.java8features;

interface CustomFIBoth{
	void display();
}
public class FunctionInterfaceLambdaTest {

	public static void main(String[] args) {
		
    // CustomFI implemented using Anonymous inner class 
		CustomFIBoth cf = new CustomFIBoth() {
		public void display() {
			System.out.println("Invoke display() using anonymous inner class ...");
		}
	};
	cf.display();
	
	
	// invoke display() method using lambda expression 
	CustomFIBoth cf2 = ()-> {
	System.out.println("Invoke display() using lambda expression ...");	
	};
	cf2.display();

}
}
