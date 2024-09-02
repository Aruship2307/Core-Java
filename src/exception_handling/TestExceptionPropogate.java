package com.eception.handling.prg;

class Big extends Exception {
	// this is always bigger exception than child class exception
}
class Small extends Big {
	// smaller exception than Big class,
}

class A   {
	void foo() throws Big {  // big always use in base class its bigger than any extended or subclass
		System.out.println("foo method of Class A");
	}
}

class B extends A {
	void foo() throws Small{
		System.out.println("foo method of class B");
	}
}

public class TestExceptionPropogate {

	public static void main(String[] args) {

		A obj = new B();

		try {
			obj.foo();
		}catch(Exception ex) {
			System.out.println("Exception throw");
		}
	}

}
