package FactoryMethod;

public class SpanishCarShop extends CarShop{
	private Car car;
	
	@Override
	public Car createCar(String carName) {
		if (carName.equalsIgnoreCase("Saab"))
			car = new SpanishSaab();
		if (carName.equalsIgnoreCase("Volvo"))
			car = new SpanishVolvo();
		return car;
	}
}
