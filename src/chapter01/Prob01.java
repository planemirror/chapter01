package chapter01;

import java.util.Scanner;

public class Prob01 {

	public static void main(String[] args) {
		
		System.out.println("3의 배수 여부 판단하기");
		System.out.println("숫자를 입력하시오");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt(); // 키보드에서 입력된 키를 number에 넣는다	
		
		int result = number % 3;
		if(result == 0)
		{
			System.out.println("3의 배수입니다.");
		}else {
			System.out.println("3의 배수가 아닙니다.");
		}
		
		
		System.out.println("입력된 수는 : " + number);
		scanner.close();
		
		
	}

}
