package code_test;

class Parent{
		public Object name() {
			System.out.println("This is parent Object class method");
			return null;
		}
} // here String is subtype of Object, hence we allowed to return it 
class Child extends Parent {
        @Override
		public String name() {
			return "this is child String class method";
		}
	}
public class TestCovariantReturnType {
	public static void main(String[] args) {
          Parent objp = new Parent();
          objp.name();
		
          Child objc = new Child();
          System.out.println(objc.name());
	}
}
