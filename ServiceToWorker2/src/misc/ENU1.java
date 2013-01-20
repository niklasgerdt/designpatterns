package misc;

import controller.resources.Resource;

public enum ENU1 implements AC1{
	EN ("E", ENU1.class, "E");

	private String a;
	private Class<?> b;
	private String c;
	
	ENU1(String a, Class<?> b, String c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void createResource(String action) {
		Resource.RESOURCE.setAction(EN.a);
		Resource.RESOURCE.setModelFactory(b);
		Resource.RESOURCE.setViewName(c);
	}

}
