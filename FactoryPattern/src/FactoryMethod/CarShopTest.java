package FactoryMethod;

import org.junit.Test;

public class CarShopTest {

	@Test
	public void test(){
		CarShop shop = new FinnishCarShop();
		shop.buyCar("SAAB");
		shop.buyCar("VOLVO");
		shop = new SpanishCarShop();
		shop.buyCar("Saab");
		shop.buyCar("Volvo");
	}
}
