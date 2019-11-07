package chapter01;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt(); // 키보드에서 입력된 키를 number에 넣는다	
		
		int result = number % 3;
		if(result == 0)
		{
			System.out.println("3의 배수입니다.");
		}else {
			System.out.println("3의 배수가 아닙니다.");
		}
		
		
		System.out.println(number);
		
		
	}

}
