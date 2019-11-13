package parking;

public class SportsCar extends Car implements Parkable{
	@Override
	public void park() {
		System.out.println("SportsCar:주차됨");
	}

}
