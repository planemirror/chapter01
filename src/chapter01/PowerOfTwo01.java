package chapter01;

import java.util.Scanner;

public class PowerOfTwo01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력한 숫자만큼 2를 곱한다\n숫자를 입력하시오 : ");
		int power = scanner.nextInt();
		
		int i = 0;
		
		long result = 1;
		
		while (i < power)
		{
			result = result * 2;
			i++;
		}
		
		
		System.out.println("결과값 : " + result + "\n2의 " + power + " 승은 " + result + " 입니다.");
		scanner.close();

	}

}
