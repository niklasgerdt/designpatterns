package controller.resources;

/**
 * @author gerdvnik
 */
public enum TestResources {
	TEST ("test", null, "/test.jsp");
	
	protected String action;
	protected Class<?> modelFactory;
	protected String viewName;
	
	TestResources(String action, Class<?> modelfactory, String viewName){
		this.action = action;
		this.modelFactory = modelfactory;
		this.viewName = viewName;
	}
}
