package chapter01;

public class Gugudan02 {

	public static void main(String[] args) {
		
		// int i = 1;
		
		for (int i = 1 ; i <= 9 ; i++)
		{

			System.out.println( "\n===== " + i +"단 출력 =====\n");
			for (int j = 1 ; j <= 9 ; j++)
			{
				System.out.println(i + " * " + j + " = " + j*i);
			}
			
		}
		System.out.println( "\n===== 구구단 출력 완료 =====");

	}

}
