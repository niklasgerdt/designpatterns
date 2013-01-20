package AbstractFactory;

public class FinnishVolvo extends Car{
	
	public FinnishVolvo(){
		description = "Saab with finnish extras";
	}
	
	
	@Override
	public void printExtras() {
		Rims rims = extraFactory.createRims();
		AirCondition airCondition = extraFactory.createAirCondition();
		System.out.print(rims+":"+airCondition+"\n");
	}
}
