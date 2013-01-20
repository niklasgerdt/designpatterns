package pkg;

import org.junit.Test;

public class IteratorTest {
	MyIterator it1;
	MyIterator it2;
	
	@Test
	public void test(){
		it1 = new Collection1();
		it2 = new Collection2();
		while (it1.hasNext())
			it1.next().print();
		while (it2.hasNext())
			it2.next().print();
	}
}
