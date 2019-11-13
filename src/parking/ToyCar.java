package parking;

public class ToyCar extends Car implements Parkable{

	@Override
	public void park() {
		System.out.println("ToyCar:주차됨");

	}

}
