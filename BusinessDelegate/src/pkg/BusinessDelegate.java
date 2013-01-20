package pkg;

public class BusinessDelegate implements Business{
	private String actualBusiness;	
	
	public BusinessDelegate(String resource){
		try{
			actualBusiness = (String)ServiceLocator.getInstance().getString(resource);
		}
		catch(Exception e){
			actualBusiness = e.getMessage();
		}
	}

	@Override
	public String getServiceName() {
		return actualBusiness;
	}
}
