package pkg;

public abstract class Driver {

	public void drive(){
		if (knowsLaw())
			fastenSeatBelt();
		start();
		throttle();
		brake();
		stop();
	}

	private void fastenSeatBelt() {
		System.out.println("fastening seat belt!");
	}

	private void start() {
		System.out.println("starting");
	}

	protected abstract void throttle();

	protected abstract void brake();

	private void stop() {
		System.out.println("stopping");
	}
	
	/*
	 * HOOK
	 */
	protected boolean knowsLaw(){
		return true;
	}
}
