package misc;

import controller.resources.Resource;

public class Test {
	public static void main(String[] a){
		System.out.print("1"+Resource.RESOURCE.getAction()+Resource.RESOURCE.getModelFactory()+Resource.RESOURCE.getViewName());
		ENU1.EN.createResource("");
		System.out.print("2"+Resource.RESOURCE.getAction()+Resource.RESOURCE.getModelFactory()+Resource.RESOURCE.getViewName());
	}
}
