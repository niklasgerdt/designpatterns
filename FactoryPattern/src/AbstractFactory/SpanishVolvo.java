package AbstractFactory;

public class SpanishVolvo extends Car{

	public SpanishVolvo(){
		description = "Saab with Spanish extras";
	}

	@Override
	public void printExtras() {
		Rims rims = extraFactory.createRims();
		AirCondition airCondition = extraFactory.createAirCondition();
		System.out.print(rims+":"+airCondition+"\n");
	}
}
