package chapter01;

import java.util.Scanner;

public class PrimeDetect {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("소수인지 판단 할 숫자 : ");
		
		int i = 2;
		int num = scanner.nextInt();
		boolean isPrime = true;
		
		// while
		// ...
		
		// 1과 num 사이의 숫자로 나누었을때 나머지가 0이 나오면 소수가 아닌것
		// 루프 중지할때는 break; 를 사용한다.
		/*
		int count = 2;
		while ( count < num)
		{
			if (num % count == 0)
			{
				
			}
			else
			{
				
			}
		
		
			count++;
		}
		*/
		
		
		if (isPrime)
		{
			System.out.println(num +" 은 소수입니다.");
		}
		else
		{
			System.out.println(num + " 은 소수가 아닙니다.");
		}
		
		scanner.close();
	}

}
