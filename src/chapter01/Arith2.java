package chapter01;

public class Arith2 {

	public static void main(String[] args) {
		int n = 1;
		
		// 후위연산자
		System.out.println(n++); // 출력후 n을 증감시킨다
		//System.out.println(n);
		//n = n + 1;		
		System.out.println(n);
		
		System.out.println(--n); // n을 가감하고 출력한다
		//n = n - 1;	
		//System.out.println(n);
		System.out.println(n);

	}

}
