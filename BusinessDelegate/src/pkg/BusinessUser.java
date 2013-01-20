package pkg;

public class BusinessUser {

	public String getResource(String resource) {
		Business bsn = new BusinessDelegate(resource);
		return bsn.getServiceName();
	}
}
