package pkg;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDecorator {

	@Test
	public void test(){
		Car car = new Volvo();
		car = new AirCondition(car);
		car = new Radio(car);
		Double price = 15800.0;
		assertEquals(price, (Double)car.getPrice());
		assertEquals("Volvo, Air condition, Radio", car.getName());
	}
}
