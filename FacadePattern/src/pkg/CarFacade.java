package pkg;

public class CarFacade {
	private Car car;
	
	public CarFacade(Car _car){
		car = _car;
	}
	
	public void drive(){
		car.openDoor();
		car.startEngine();
		car.changeGear();
		car.throttle();
	}
	
	public void stopDriving(){
		car.stopEngine();
		car.closeDoor();
	}
}
