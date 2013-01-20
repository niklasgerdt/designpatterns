package pkg;

public class RallyDriver extends Driver{

	@Override
	protected void brake() {
		System.out.println("braking hard");
	}

	@Override
	protected void throttle() {
		System.out.println("throttling hard");
	}
}
