package chapter01;

public class IfTest {

	public static void main(String[] args) {
		int a = 20;
		int b = 29;
		
		
		// ==============
		int diff = 0;
		if ( a > b ) {
			diff  = a - b;
		} else {
			diff = b - a;
		}
		
		System.out.println(diff);

	}

}
