package pkg;

public abstract class Car {
	protected String name = "Unknown";

	public String getName() {
		return name;
	}
	
	public abstract double getPrice();
}
