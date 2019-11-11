package chapter01;

public class WhileTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// continue를 사용할 때 주의점, 무한루프에 빠지는 오류 예시
		int i = 0;
		while (i < 10)
		{
			if (i > 5)
			{
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}

}
