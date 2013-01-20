package service;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class Service extends UnicastRemoteObject implements ServiceInterface{
	private static final String SERVICE = "SERVICE";
	private static final long serialVersionUID = 3445443498889824943L;

	protected Service() throws RemoteException {
		super();
	}

	@Override
	public MyDate getMyDate() throws RemoteException {
		return new MyDate(new Date());
	}

	public static void main(String a[]){
		try {
			ServiceInterface serv = new Service();
			Naming.rebind(SERVICE, serv);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
