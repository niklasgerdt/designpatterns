package AbstractFactory;

public class FinnishCarShop extends CarShop{
	private Car car;
	
	@Override
	public Car createCar(String carName) {
		if (carName.equalsIgnoreCase("Volvo")){
			car = new FinnishVolvo();
			car.setFactory(new FinnishExtrasFactory());
		}
		return car;
	}
}
