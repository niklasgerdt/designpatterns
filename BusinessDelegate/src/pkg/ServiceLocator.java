package pkg;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ServiceLocator {
	private static ServiceLocator serviceLocator = new ServiceLocator();
	private InitialContext initialContext;
	
	private ServiceLocator(){
		try {
			initialContext = new InitialContext();
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	public static ServiceLocator getInstance(){
		return serviceLocator;
	}
	
	public String getString(String serviceName){
		String name = null;
		try {
			name = (String)initialContext.lookup(serviceName);
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return name;
	}
}
