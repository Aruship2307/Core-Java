package code_test;

public class ForLoopTest {

	public static void main(String[] args) {

		int i=0;
		int num=0;
		
		while(i<4) {
			num=(++i *5); 
			System.out.println(num);
		}
	}

}

// for pre increment the value of i=1 --->>> then o/p = 5,10,15,20
// for post increment the value of i=1 -- but not print so hence ==>>then o/p = 0,5,10,15