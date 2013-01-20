package pkg;

import org.junit.Before;
import org.junit.Test;

public class FacadeTest {
	private Car car;
	private CarFacade facade;
	
	@Before
	public void setup(){
		car = new Volvo();
		facade = new CarFacade(car);
	}
	
	@Test
	public void withoutFacade(){
		// DRIVE
		car.openDoor();
		car.startEngine();
		car.changeGear();
		car.throttle();
		// STOP
		car.stopEngine();
		car.closeDoor();
	}
	
	@Test
	public void withFacade(){
		facade.drive();
		facade.stopDriving();
	}
}
