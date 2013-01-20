package pkg;

import org.junit.Test;

public class TemplateTest {

	@Test
	public void test(){
		Driver driver = new RallyDriver();
		driver.drive();
		System.out.println("************");
		driver  = new SundayDriver();
		driver.drive();
	}
}
