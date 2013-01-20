package pkg;

public class MyActualObject implements MyObject{
	private final static String DATA = "DATA from MyActualObject";

	@Override
	public void print() {
		System.out.println(DATA);
	}
}
