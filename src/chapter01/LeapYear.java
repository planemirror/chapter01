package chapter01;

public class LeapYear {

	public static void main(String[] args)
	{
		// 1. 4로 나누어서 나머지가 0이 아닌 해는 윤년이 아니다
		
		// 2. 4로 나누어서 나머지가 0인 해 중에 100으로 나누어서 나머지가 0이 아닌 해가 윤년이다
		
		// 3. 4로 나누어서 나머지가 0인 해 중에 100으로 나누어서 나머지가 0인 해 중에
		//	  400으로 나누어서 나머지가 0인 해는 윤년이다
		
		// 4. 4로 나누어서 나머지가 0인 해 중에 100으로 나누어서 나머지가 0인 해 중에
		//	  400으로 나누어서 나머지가 0이 아닌 해는 윤년이 아니다
		
		int year = 2016;
		
		if(year % 4 != 0)
		{
			System.out.println("1. 윤년이 아닙니다");
		}
		else
		{
			if (year % 100 != 0)
			{
				System.out.println("2. 윤년 입니다");
			}
			else
			{
				if(year % 400 == 0)
				{
					System.out.println("3. 윤년 입니다");
				}
				else
				{
					System.out.println("4. 윤년이 아닙니다.");
				}
			}
		}
		
		if (year % 4 != 0)
		{
			System.out.println("1. 윤년이 아닙니다");
		}
		else if (year % 100 != 0)
		{
			System.out.println("2. 윤년 입니다");
		}
		else if (year % 400 == 0)
		{
			System.out.println("3. 윤년 입니다");
		}
		else
		{
			System.out.println("4. 윤년이 아닙니다.");
		}
	}

}
