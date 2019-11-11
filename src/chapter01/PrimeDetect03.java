package chapter01;

//import java.util.Scanner;

public class PrimeDetect03 {
	
	// 함수를 사용하여 모듈화 하는 방법

	public static boolean isPrime(int x)
	{
		 int i = 2;
		 boolean  isPrime = true;
		 while ( i < x )
		 {
			 int result = x % i;
			 if (result == 0)
			 {
				 isPrime = false;
				 break;
				 
			 }
			 i++;
		 }
		return isPrime;
	}
	
	public static void main(String[] args)
	{
		
		 
		 int j = 2;
		 while (j <= 1000)
		 {
			 int num = j;
			 boolean result = isPrime(num);

			 
			 if(result == true)
			 {
				 System.out.println("소수출력 : " + num);
			 }
			 j++;
		 }
	}

}
