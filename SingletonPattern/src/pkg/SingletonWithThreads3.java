package pkg;

public class SingletonWithThreads3 {
	private static SingletonWithThreads3 onlyOne;
	
	/*
	 * Thread save, but object might be created for nothing
	 */
	public static SingletonWithThreads3 getInstance(){
		return onlyOne;
	}
}
