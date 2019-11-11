package chapter01;

public class InfiniteLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		
//		int i = 0;
//		while(true)
//		{
//			sum += i;
//			if (sum >= 5000)
//			{
//				break;
//			}
//			i++;
//		}
//		
//		System.out.println(sum);
//		
		
		// 무한루프를 For문으로 바꿔봄
		for(int i = 0;;)
		{
			sum += i;
			if (sum >= 5000)
			{
				break;
			}
			i++;
		}
		System.out.println(sum);

	}

}
