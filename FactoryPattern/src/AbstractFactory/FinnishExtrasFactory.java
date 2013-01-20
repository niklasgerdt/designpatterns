package AbstractFactory;

public class FinnishExtrasFactory implements ExtrasFactory{

	@Override
	public AirCondition createAirCondition() {
		return new FinnishAirCondition();
	}

	@Override
	public Rims createRims() {
		return new FinnishRims();
	}

}
