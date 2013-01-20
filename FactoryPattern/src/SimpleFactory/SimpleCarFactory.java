package SimpleFactory;

public class SimpleCarFactory {
	private Car car;

	public Car createCar(String boughtCar){
		if (boughtCar.equalsIgnoreCase("Saab"))
			car = new Saab();
		if (boughtCar.equalsIgnoreCase("Volvo"))
			car = new Volvo();
		return car;
	}
}
