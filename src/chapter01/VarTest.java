package chapter01;

public class VarTest {

	public static void main(String[] args) {
		
		/*
		 * 기본타입 (Primitive Type)		
		 */
		
		// 정수
		byte b = 1;
		short s = 10;
		int i = 2000;
		long l = 1234567890L; // L로 식별
		
		// 실수
		float f = 3.14f; // f로 식별
		double d = 3.14;
		
		// 문자
		char c = 'A';
		char c2 = 65;
		
		// 불린
		boolean bool = true;
		boolean bool2 = false;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(c2);
		System.out.println(bool);
		System.out.println(bool2);		
		System.out.println("\n");
		/*
		 * 참조형 (Reperence Type)
		 */
		
		// 문자열
		// 문자열은 기본타입이 아니다
		// 문자열은 기본타입 char가 모여있는 String 클래스의 객체다
		// String str = new String("Hello");
		String str = "hello";		
		System.out.println(str.length());
		
		/*
		 *  지역변수 초기화
		 */
		// 지역변수는 초기화가 되어야 한다
		// 클래스를 정의하는 블럭({})을 제외한 나머지 블럭({})에 있는 변수는 꼭 초기화
		// 초기화가 안된 상태로 사용하면 오류가 발생함		
		int j = 0;
		System.out.println(j);
		
		/*
		 * 상수
		 */
		final int NUMBER = 10;
		System.out.println(NUMBER);
		//NUMBER = 100;
		// 오류
		// 초기화 할 때 final이 붙어 있는 변수는
		//초기화 이후부터는 값을 대입 할 수 없다
	}

}
