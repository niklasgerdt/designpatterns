package pkg;

public class Volvo implements Car{

	@Override
	public void changeGear() {
		System.out.println("changing gear");
	}

	@Override
	public void closeDoor() {
		System.out.println("closing door");		
	}

	@Override
	public void openDoor() {
		System.out.println("opening door");		
	}

	@Override
	public void startEngine() {
		System.out.println("starting engine");		
	}

	@Override
	public void stopEngine() {
		System.out.println("stopping engine");		
	}

	@Override
	public void throttle() {
		System.out.println("throttling");		
	}
}
