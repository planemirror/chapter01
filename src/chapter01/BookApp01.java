package chapter01;

public class BookApp01 {

	public static void main(String[] args) {
		
				
		Book book = new Book();
		
		System.out.println(book);
		System.out.println(book.title);
		System.out.println(book.price);
		

		System.out.print("\n");
		
		book.title = "A";
		book.price = 1000;
		

		System.out.println(book.title);
		System.out.println(book.price);
		
		System.out.print("\n");
		
		Book[] bs = new Book[3];
//		bs[0].price = 10; // 오류  // 한줄 위 Book[] bs = new Book[3]; 코드에선 공간만 생성, 값이 들어 갈 수 없다.
//		bs[1].price = 20;
//		bs[2].price = 30;
		
		bs[0] = new Book();
		bs[0].title = "A";
		bs[0].price = 1000;
		
		bs[1] = new Book();
		bs[1].title = "B";
		bs[1].price = 2000;
		
		bs[2] = new Book();
		bs[2].title = "C";
		bs[2].price = 3000;
		
		System.out.print("\n");
		
		for(Book b : bs)
		{
			System.out.println(b.title + ":" + b.price);
		}

	}

}
