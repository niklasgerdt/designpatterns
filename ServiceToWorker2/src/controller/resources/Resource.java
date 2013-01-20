package controller.resources;

public enum Resource {
	RESOURCE ("", null, "");
	
	private String action;
	private Class<?> modelFactory;
	private String viewName;
	
	Resource(String action, Class<?> modelFactory, String viewName){
		this.setAction(action);
		this.setModelFactory(modelFactory);
		this.setViewName(viewName);
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getAction() {
		return action;
	}

	public void setModelFactory(Class<?> modelFactory) {
		this.modelFactory = modelFactory;
	}

	public Class<?> getModelFactory() {
		return modelFactory;
	}

	public void setViewName(String viewName) {
		this.viewName = viewName;
	}

	public String getViewName() {
		return viewName;
	}
}
