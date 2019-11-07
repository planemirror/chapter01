package chapter01;

public class TypeCast {

	public static void main(String[] args) {
		// implicity(암묵적) Type Cast
		int i = 10;
		long l = i;
		
		System.out.println( i + ":" +l );
		
		// explicity(명시적) Type Cast
		long l2 = 10L;
		//int i2 = (int)l2;
	}
}
