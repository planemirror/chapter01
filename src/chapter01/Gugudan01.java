package chapter01;

public class Gugudan01 {

	public static void main(String[] args) {
		
		int i = 1;
		
		while ( i <= 9)
		{

			System.out.println( "\n===== " + i +"단 출력 =====\n");
			int j = 1;
			while (j <= 9)
			{
				System.out.println(i + " * " + j + " = " + j*i);	
				j++;
			}
			
			i++;
		}
		System.out.println( "\n===== 구구단 출력 완료 =====");

	}

}
