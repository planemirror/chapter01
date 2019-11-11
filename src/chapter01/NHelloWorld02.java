package chapter01;

import java.util.Scanner;

public class NHelloWorld02 {

	public static void main(String[] args) {
		System.out.print("입력한 숫자만큼 Hello World 출력 \n숫자 입력하시오 : ");
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt(); //blocking
		// System.out.println(number);
		
//		int i = 1;
//		while ( i <= number)
//		{
//			System.out.println("HelloWorld" + "   #출력횟수 : " + i);
//			i++;
//		}
		
		for ( int i = 1 ; i <= number ; i ++)
		{
			System.out.println("HelloWorld" + "   #출력횟수 : " + i);
		}
		
		scanner.close();

	}

}
