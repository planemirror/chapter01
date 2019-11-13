package parking;

public class Truck extends Car implements Parkable{
	@Override
	public void park() {
		System.out.println("Truck:주차됨");
	}

}
