package com.collections.codingImp;
import java.util.List;
import java.util.LinkedList;

class Mobile {
	double price;
	String name, modelNum;
	int quantity;
	
	Mobile (double price, String name, String modelNum, int quantity){
		this.price=price;
		this.name=name;
		this.modelNum=modelNum;
		this.quantity=quantity;
	}

	@Override
	public String toString() {
		return "Mobile [price=" + price + ", name=" + name + ", modelNum=" + modelNum + ", quantity=" + quantity + "]";
	}
}


public class LLMobileProp {
	public static void main(String[] args) {
		// creating list of mobile
		
        List<Mobile> mob = new LinkedList<Mobile>();
		
		// created objects for the list 
				
		Mobile m1 = new Mobile(99999.00,"Apple","10xPro",4);

		Mobile m2 = new Mobile(79999.00,"Samsung","S99Max",4);

		Mobile m3 = new Mobile(49999.00,"OnePlus","Nord10T",4);
		
		// Adding all type of mobile to mob list
		mob.add(m1);
		mob.add(m2);
		mob.add(m3);

		// traversing the list by for each 
		System.out.println("Features of Mobile:");
	  for(Mobile m: mob) {
		  System.out.println("Price = "+m.price+", Mobile Name = "+m.name+", Model No = "+m.modelNum+", Quantity = "+m.quantity);
	  }
	}
}
