package chapter01;

public class ArrayTest01 {

	public static void main(String[] args) {
		// 배열의 필요성
		int student1Scoree = 90;
		int student2Scoree = 80;
		int student3Scoree = 70;
		int student4Scoree = 90;
		int student5Scoree = 100;
		
		int sum = student1Scoree + student2Scoree + student3Scoree + student4Scoree + student5Scoree;
		System.out.println(sum/5 + "\n");
		
		// 배열을 사용했을 때
		int[] studentScores = new int[5];
		studentScores[0] = 90;
		studentScores[1] = 80;
		studentScores[2] = 70;
		studentScores[3] = 90;
		studentScores[4] = 100;
		
		// forloop 순회
		System.out.println(studentScores.length);
		
		int sum2 = 0;
		for (int count = 0 ; count < studentScores.length ; count++)
		{
			sum2 += studentScores[count];
		}
		
		System.out.println(sum2/studentScores.length + "\n");
		
		// foreach 순회
		int sum3 = 0;
		for(int score :studentScores) {
			sum3 += score; 
		}
		
		System.out.println(sum3/studentScores.length + "\n");
		
		
	}

}
