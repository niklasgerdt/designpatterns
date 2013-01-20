package pkg;

public class BrochurePrint implements Print{
	private static final String PRINT = "This is brochure!";
	
	@Override
	public void print() {
		System.out.println(PRINT);
	}
}
