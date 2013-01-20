package pkg;

public class AirCondition extends Extras{
	private Car car;
	
	public AirCondition(Car _car){
		car = _car;
	}
	
	@Override
	public String getName() {
		return car.getName() + ", Air condition";
	}

	@Override
	public double getPrice() {
		return car.getPrice() + 500;
	}
}
