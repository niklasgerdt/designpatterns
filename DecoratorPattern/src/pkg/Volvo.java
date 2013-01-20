package pkg;

public class Volvo extends Car{

	public Volvo(){
		name = "Volvo";
	}
	
	@Override
	public double getPrice() {
		return 15000;
	}
}
