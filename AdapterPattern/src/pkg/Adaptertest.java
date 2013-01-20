package pkg;

import org.junit.Test;


public class Adaptertest {
	
	@Test
	public void test(){
		Car car = new Volvo();
		car.doCarStyff();
		Truck truck = new Scania();
		car = new TruckAdapter(truck);
		car.doCarStyff();
	}
}
