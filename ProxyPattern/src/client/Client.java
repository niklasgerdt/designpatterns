package client;

import java.rmi.Naming;

import service.MyDate;
import service.ServiceInterface;

public class Client {

	private static final String SERVICE2 = "SERVICE";
	private static final String RMI_HOST = "rmi://127.0.0.1/";

	public static void main(String[] args) {
		try {
			ServiceInterface service = (ServiceInterface)Naming.lookup(RMI_HOST+SERVICE2);
			MyDate myd = service.getMyDate();
			System.out.println(myd.getDateString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
