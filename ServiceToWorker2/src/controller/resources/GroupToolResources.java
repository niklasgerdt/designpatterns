package controller.resources;

public enum GroupToolResources {
	ERROR ("error", null, "/error.jsp");
	
	protected String action;
	protected Class<?> modelFactory;
	protected String viewName;
	
	GroupToolResources(String action, Class<?> modelfactory, String viewName){
		this.action = action;
		this.modelFactory = modelfactory;
		this.viewName = viewName;
	}
}
