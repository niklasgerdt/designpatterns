package AbstractFactory;

import org.junit.Test;

public class Tests {
	
	@Test
	public void test(){
		CarShop shop = new FinnishCarShop();
		shop.buyCar("volvo");
		Car car = shop.getCar();
		car.printExtras();
		shop = new SpanishCarShop();
		shop.buyCar("volvo");
		car = shop.getCar();
		car.printExtras();
	}
}
