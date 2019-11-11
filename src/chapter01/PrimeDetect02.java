package chapter01;

import java.util.Scanner;

public class PrimeDetect02 {

	public static void main(String[] args) {
		
//		int i = 2;
//		int num = 1000;
//		boolean isPrime = true;
//		
//		 while (i < num)
//		 {
//			 int count = 2;
//			 while (count < num)
//			 {
//				 int result = num % count;
//				 if (result == 0)
//				 {
//					 System.out.println(i);
//					 break;
//				 }
//			 }
//			 i++;
//		}
		// 첫번째 while문 안에 출력을 넣어야 했다. 
		 
		 int j = 2;
		 while (j <= 1000)
		 {
			 int num = j;
			 
			 int i = 2;
			 boolean  isPrime = true;
			 while ( i < num )
			 {
				 int result = num % i;
				 if (result == 0)
				 {
					 isPrime = false;
					 break;
					 
				 }
				 i++;
			 }
			 
			 if(isPrime)
			 {
				 System.out.println(num);
			 }
			 j++;
		 }
	}

}
