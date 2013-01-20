package pkg;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection1 implements MyIterator{
	private ArrayList<MyObject> list;
	private Iterator<MyObject> iterator;
	
	public Collection1(){
		list = new ArrayList<MyObject>();
		list.add(new MyActualObject());
		list.add(new MyActualObject());
		list.add(new MyActualObject2());
		iterator = list.iterator();
	}
	
	@Override
	public boolean hasNext() {
		return iterator.hasNext();
	}

	@Override
	public MyObject next() {
		return iterator.next();
	}
}
