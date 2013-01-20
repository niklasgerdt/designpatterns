package pkg;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestStrategyPattern {
	private static final String SURNAME = "NYK�NEN";
	private static final String FIRSTNAME = "MATTI";
	private NameFormatter formatter;
	private Name name;
	
	@Before
	public void setName(){
		name = new Name();
		name.setFirstName(FIRSTNAME);
		name.setSurName(SURNAME);
	}
	
	@Test
	public void formatstoFirstNameSurName(){
		formatter = new FirstNameSurNameFormatter();
		name.setFormatter(formatter);
		String formattedName = name.getFormattedName();
		String expected = "MATTI, NYK�NEN";
		assertEquals(expected, formattedName);
	}
	
	@Test
	public void formatstoSurNameFirstName(){
		formatter = new SurNameFirstNameFormatter();
		name.setFormatter(formatter);
		String formattedName = name.getFormattedName();
		String expected = "NYK�NEN, MATTI";
		assertEquals(expected, formattedName);
	}
}
