package FactoryMethod;

public class FinnishCarShop extends CarShop{
	private Car car;
	
	@Override
	public Car createCar(String carName) {
		if (carName.equalsIgnoreCase("Saab"))
			car = new FinnishSaab();
		if (carName.equalsIgnoreCase("Volvo"))
			car = new FinnishVolvo();
		return car;
	}
}
