package com.java8features;

@FunctionalInterface
interface Interf {
	public void show();
}

class  Trial {  // outer class 
	int x=88;
	public void m2(){
		Interf i = () ->{ // inner 
			int x=99;
			System.out.println(this.x);  // inside lambda this refer to out class var  but inside anonymous inner class this refr to inner class var
		};
		i.show();
	}
}
public class DemoLambdaInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trial d = new Trial();
		d.m2();

	}

}
