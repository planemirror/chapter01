package chapter01;

import java.util.Scanner;

public class PrimeDetect01 {

	public static void main(String[] args) {
		
		// 1과 num 사이의 숫자로 나누었을때 나머지가 0이 나오면 소수가 아닌것
		// 루프 중지할때는 break; 를 사용한다.
				
		Scanner scanner = new Scanner(System.in);
		System.out.print("소수인지 판단 할 숫자 : ");
		
		int i = 2;
		int num = scanner.nextInt();
		boolean isPrime = true;
		
		 while (i < num)
		 {
			 int result = num % i;
			 if (result == 0)
			 {
				 isPrime = false;
				 break;
			 }
			 i++;
		 }
				
		
		if (isPrime)
		{
			System.out.println(num +" 은 소수입니다.");
		}
		else
		{
			System.out.println(num + " 은 소수가 아닙니다.");
		}
		
		scanner.close();
		
		
//		Scanner scanner = new Scanner( System.in );
//		
//		System.out.print("입력한 숫자가 소수인지 확인합니다\n숫자를 입력하세요 : ");
//		
//		int number = scanner.nextInt();
//		int count = 2;
//		boolean boolresult = false;
//		
//		while (count < number)
//		{
//			int result = number % count;
//			count++;
//			if (result == 0)
//			{
//				boolresult = false;
//				break;
//			}
//			else
//			{
//				boolresult = true;
//			}
//		}
//		
//		if (boolresult)
//		{
//			System.out.println("입력한 숫자 "+ number +" 는(은) 소수입니다");
//		}
//		else
//		{
//			System.out.println("입력한 숫자 "+ number +" 는(은) 소수가 아닙니다");		
//		}
//		
//		scanner.close();
	}

}
