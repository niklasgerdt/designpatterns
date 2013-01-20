package version2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestObserverPattern {
	private static final String NAME = "MATTI NYKÄNEN";

	@Test
	public void test(){
		Name name = new Name();
		Observer saver = new NameSaver();
		name.getObserverHandler().registerObserver(saver);
		name.setName(NAME);
		assertEquals(NAME, Storage.name);
	}
}
