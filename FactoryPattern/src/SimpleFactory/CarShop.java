package SimpleFactory;

public class CarShop {
	private Car car;;
	private SimpleCarFactory factory;
	
	public CarShop(SimpleCarFactory _factory){
		factory = _factory;
	}
	
	public void buyCar(String boughtCar){
		car = factory.createCar(boughtCar);
		System.out.print(car.getPrice()+":"+car.getColor()+":"+car.getWeight()+"\n");
	}
}
