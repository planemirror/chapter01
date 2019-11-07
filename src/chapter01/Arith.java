package chapter01;

public class Arith {

	public static void main(String[] args) {
		
		
		/*
		 *  산술연산자 (이항연산자)
		 */
		int a = 3;
		int b = 7;
		
		int r1 = a + b;
		System.out.println(r1);
		
		int r2 = a - b;
		System.out.println(r2);
		
		int r3 = a * b;
		System.out.println(r3);
		
		int r4 = a / b;
		System.out.println(r4);
		
		int r5 = a % b;
		System.out.println(r5);
		
		// int op int => int // int와 int를 연산하면 int가 결과값으로
		System.out.println(10/3);
		
		// int op double => double // double과 int를 연산하면 double이 결과값으로
		System.out.println(10/3.0);
		
		// 주의
		System.out.println((double)10/3); // 10.0 / 3
		
		// 연산자 우선순위를 주의
		System.out.println((double)(10/3)); // 10.0 / 3
		
		
		/*
		 * 증감연산자는 (단항연산자)
		 * ++, --
		 */
		int n = 1;
		n++; // n = n + 1 // 후위
		System.out.println(n);
		
		n--; // n = n - 1
		System.out.println(n);
		
		++n; // n = n + 1 // 전위
		System.out.println(n);
		
		
		
		
		// 참고 (산술연산자는 다음과 같이 축약 형을 쓸 수 있다)
		n += 10; // n = n + 10
		System.out.println(n);
		
		n -= 10; // n = n - 10
		System.out.println(n);
		
		n *= 10; // n = n * 10
		System.out.println(n);
	}

}
