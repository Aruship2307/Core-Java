package com.collections.codingImp;
class High{
	public Object name() {
		long p = 918698556704l;
		return p;
	}
} // here Integer is subtype of Object, hence we allowed to return it 
class Low extends High {
    @Override
	public Integer name() {
		int c = 8698;
		return c;
	}
}
public class TestCovariantReturnInLon {

	public static void main(String[] args) {

		High objp = new High();
        objp.name();
		
		  System.out.println("Object Long parent class method: "+objp.name());

		  Low objc = new Low();
        System.out.println("Integer Child class method: "+objc.name());
	}

}
