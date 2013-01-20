package pkg;

public class Radio extends Extras{
	private Car car;
	
	public Radio(Car _car){
		car = _car;
	}
	
	@Override
	public String getName() {
		return car.getName() + ", Radio";
	}

	@Override
	public double getPrice() {
		return car.getPrice() + 300;
	}
}
