package pkg;

public class TruckAdapter implements Car{
	private Truck truck;
	
	public TruckAdapter(Truck _truck){
		truck = _truck;
	}
	
	@Override
	public void doCarStyff() {
		truck.doTruckStyff();
	}
}
