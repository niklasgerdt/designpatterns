package AbstractFactory;

public class SpanishExtrasFactory implements ExtrasFactory{

	@Override
	public AirCondition createAirCondition() {
		return new SpanishAirCondition();
	}

	@Override
	public Rims createRims() {
		return new SpanisRims();
	}

}
