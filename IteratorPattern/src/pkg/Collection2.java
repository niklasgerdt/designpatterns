package pkg;

public class Collection2 implements MyIterator {
	private MyObject[] list;
	private int pointer;
	
	public Collection2(){
		list = new MyObject[100];
		list[0] = new MyActualObject2();
		list[1] = new MyActualObject2();
		pointer = 0;
	}
	
	@Override
	public boolean hasNext() {
		if (list[pointer] != null)
			return true;
		return false;
	}

	@Override
	public MyObject next() {
		MyObject myO = list[pointer];
		pointer++;
		return myO;
	}
}
