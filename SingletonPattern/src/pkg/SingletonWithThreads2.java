package pkg;

public class SingletonWithThreads2 {
	private static SingletonWithThreads2 onlyOne;
	
	private SingletonWithThreads2(){
	}
	
	/*
	 * Thread save
	 */
	public static synchronized SingletonWithThreads2 getInstance(){
		if (onlyOne==null){
			synchronized (SingletonWithThreads2.class) {
				if (onlyOne==null)
					onlyOne = new SingletonWithThreads2();
			}
		}
		return onlyOne;
	}
}
