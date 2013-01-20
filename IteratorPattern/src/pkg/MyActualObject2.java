package pkg;

public class MyActualObject2 implements MyObject{
	private final static String DATA = "DATA from MyActualObject2";

	@Override
	public void print() {
		System.out.println(DATA);
	}
}