package AbstractFactory;

public class SpanishCarShop extends CarShop{
	private Car car;
	
	@Override
	public Car createCar(String carName) {
		if (carName.equalsIgnoreCase("Volvo")){
			car = new SpanishVolvo();
			car.setFactory(new SpanishExtrasFactory());
		}
		return car;
	}
}
