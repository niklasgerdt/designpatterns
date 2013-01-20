package SimpleFactory;

import org.junit.Test;

public class CarShopTest {

	@Test
	public void test(){
		CarShop shop = new CarShop(new SimpleCarFactory());
		shop.buyCar("SAAB");
		shop.buyCar("VOLVO");
	}
}
