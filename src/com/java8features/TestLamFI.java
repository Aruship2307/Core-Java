package com.java8features;


interface P {
	//
   // public void m();
    
    
    public void sum(int a, int b); //-- second abstract method 
}

/*class C implements P {
    
    @Override
    public void	m() {
	    System.out.println("Without lambda foreach: ");
	}
}*/
public class TestLamFI {

	public static void main(String[] args) {
		// with lambda expression code
		/*P obj = () ->  System.out.println("With lambda foreach: ");
		obj.m();*/
			
		
		P ob3 = (a,b) -> System.out.println("With lambda by sum is: "+(a+b));
		ob3.sum(20,25);
		ob3.sum(10,18);
		
		// created object for without lambda (C class also for this)
		/*P obj1 = new C() ;
		obj1.m()*/;
	}

}
