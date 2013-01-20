package pkg;

public class AlarmPrint implements Print{
	private static final String PRINT = "This is alarm!";

	@Override
	public void print() {
		System.out.println(PRINT);
	}
}
