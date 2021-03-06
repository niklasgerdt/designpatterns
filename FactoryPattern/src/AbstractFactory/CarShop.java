package AbstractFactory;

public abstract class CarShop {
	private Car car;
	
	public void buyCar(String boughtCar){
		car = createCar(boughtCar);
		System.out.print(car.getDescription()+"\n");
	}
	
	public Car getCar(){
		return car;
	}
	
	public abstract Car createCar(String car);
}
