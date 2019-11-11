package chapter01;

import java.util.Scanner;

public class SumInput02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int sum = 0;
				
		
		for ( int count = 1 ; count <= num ; count++ )
		{
			sum = sum + count;
		}
		
		System.out.println(num + "까지 합은 " + sum + " 입니다");
		
		scanner.close();

	}

}
