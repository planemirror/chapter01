package parking;

public class Bus extends Car implements Parkable{
	@Override
	public void park()
	{
		System.out.println("Bus:주차됨");
	}

}
