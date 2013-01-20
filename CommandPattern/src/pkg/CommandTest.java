package pkg;

import org.junit.Test;

public class CommandTest {

	@Test
	public void test(){
		Printter printter = new Printter();
		printter.addPrint(new AlarmPrint());
		printter.addPrint(new BrochurePrint());
		printter.addPrint(new AlarmPrint());
		printter.addPrint(new AlarmPrint());
		printter.addPrint(new AlarmPrint());
		printter.addPrint(new DelegatedPrint("My message!"));
		printter.print();
	}
}
