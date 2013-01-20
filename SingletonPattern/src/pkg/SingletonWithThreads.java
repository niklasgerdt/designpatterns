package pkg;

public class SingletonWithThreads {
	private static SingletonWithThreads onlyOne;
	
	private SingletonWithThreads(){
	}
	
	/*
	 * Method has overhead
	 */
	public static synchronized SingletonWithThreads getInstance(){
		if (onlyOne==null)
			onlyOne = new SingletonWithThreads();
		return onlyOne;
	}
}
