package AbstractFactory;

public abstract class Car {
	protected String description;
	protected ExtrasFactory extraFactory;

	public String getDescription() {
		return description;
	}
	
	public void setFactory(ExtrasFactory _factory){
		extraFactory = _factory;
	}
	
	public abstract void printExtras();
}