package service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServiceInterface extends Remote{
	/**
	 * @return date as string 
	 * @throws RemoteException
	 */
	public MyDate getMyDate() throws RemoteException;
}
