package chapter01;

public class BookApp02 {

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.title = "A";
		System.out.println(b1.title);
		
		Book b2 = b1;
		b2.price = 1000;
		System.out.println(b1.price);
		
		b1.price = 2000;

		System.out.println(b2.price);
		
		b1 = null;
		// 오류
		// b1.price = 2000;
		
		b2 = null;
		//오류
		//b2.price = 2000;
		

	}

}
