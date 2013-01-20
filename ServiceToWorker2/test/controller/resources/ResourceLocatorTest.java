package controller.resources;

import junit.framework.TestCase;

/**
 * @author gerdvnik
 */
public class ResourceLocatorTest extends TestCase {
	private ResourceLocator locator;
	
	public void setup(){
		locator = new ResourceLocator(TestResources.values());
	}
	
	public void testLoadsResourceByActionName(){
		
	}
}
