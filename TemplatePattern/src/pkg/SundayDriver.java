package pkg;

public class SundayDriver extends Driver{

	@Override
	protected void brake() {
		System.out.println("braking easy");
	}

	@Override
	protected void throttle() {
		System.out.println("throttling easy");		
	}

	@Override
	protected boolean knowsLaw(){
		return false;
	}
}
