package chapter01;

import java.util.Scanner;

public class SumInput01 {

	public static void main(String[] args) {
		
		//int number = 10;
		
		System.out.print("입력된 숫자까지 숫자들의 합을 구함 \n숫자를 입력하시오 : ");
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		int sum = 0;
		
		int count = 0;
		
		while ( count < number+1)
		{
			sum = sum + count;
			
			count++;
		}
		
		System.out.println(number + "까지 합은 " + sum + " 입니다");
		
		scanner.close();

	}

}
