package chapter01;

public class CarTest {

	public static void main(String[] args) {
		
		Bus bus = new Bus();
		bus.run();
		
		// 자식 객체는 부모타입으로 참조 할 수 있다.
		// 객체지향 확장을 이해하기 위해서는 이것이 자연스러워야 한다.
		Car c = new Bus();
		c.run();
		
		// 오류
		// Bus b = new Car();
		
		
		Car c2 = new Bus();
		c2.run();
		
		// 캐스팅을 해야됨
		((Bus)c2).info();
	}

}
