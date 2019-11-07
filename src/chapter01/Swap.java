package chapter01;

import java.util.Scanner;

public class Swap {


	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 30;
		
		// Q1: n1값이 항상 큰 값이 되도록, 필요한 경우 n1과 n2를 교체하라
		
		if (n1 < n2 )
		{
			//int temp = 0;
			//temp = n1;
			//n1 = n2;
			//n2 = temp;
			
			int temp = n2;
			n2 = n1;
			n1 = temp;
		}
		
		System.out.println("n1: " +n1);
		System.out.println("n2: " +n2);
		
		// Q2: 최대값을 판별하는 조건을 완성해 보세요
		int a1 = 20;
		int a2 = 10;
		int a3 = 50;
		
		if (a1 >= a2)
		{
			if (a1 > a3)
			{
				System.out.println("최대값은 " + a1 + "입니다");
			}
			else
			{
				System.out.println("최대값은 " + a3 + "입니다");
			}
		}
		
		else
		{
			if(a2 > a3)
			{
				System.out.println("최대값은 " + a2 + "입니다");
			}
			else
			{
				System.out.println("최대값은 " + a3 + "입니다");
			}
		}
		
		System.out.println("");
		System.out.println("3개의 수를 입력");
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1번째 수 입력 : ");
		int b1 = scanner.nextInt();
		System.out.println("2번째 수 입력 : ");
		int b2 = scanner.nextInt();
		System.out.println("3번째 수 입력 : ");
		int b3 = scanner.nextInt();
		
		if (b1 >= b2)
		{
			if (b1 > b3)
			{
				System.out.println("최대값은 " + b1 + "입니다");
			}
			else
			{
				System.out.println("최대값은 " + b3 + "입니다");
			}
		}
		
		else
		{
			if(b2 > b3)
			{
				System.out.println("최대값은 " + b2 + "입니다");
			}
			else
			{
				System.out.println("최대값은 " + b3 + "입니다");
			}
		}	
		
		scanner.close();

	}

}
