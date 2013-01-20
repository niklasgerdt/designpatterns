package pkg;

public class Singleton {
	private static Singleton onlyOne;
	
	private Singleton(){
	}
	
	/*
	 * Method is not thread save
	 */
	public static Singleton getInstance(){
		if (onlyOne==null)
			onlyOne = new Singleton();
		return onlyOne;
	}
}
