package code_test;

public class StringMethods {

	public static void main(String[] args) {
		String s1 = "Hello"; // This string will be interned
		String s2 = "Hello"; // This will refer to the same interned string object as s1

		String s3 = new String("Hello"); // This will not be interned
		String s4 = s3.intern(); // Explicitly intern s3, if it's not already interned

		System.out.println(s1 == s2); // Output: true
		System.out.println(s1 == s3); // Output: false
		System.out.println(s1 == s4); // Output: true

	}
}


/*when you create a String object using a string literal, 
 *Java automatically interns the string if it doesn't already exist in the string pool.
 *The string pool is a special area in the Java heap where interned strings are stored.
*Subsequent string literals with the same value will refer to the same interned string object.*/
