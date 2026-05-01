package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {
		Set <String> s = new HashSet <String>();
		s.add("Red");
		s.add("Blue");
		s.add("Yellow");
		s.add("Black");
		s.add("white");
		System.out.println(s);
		
		//Iterator
		Iterator it = s.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//remove last element only
		it.remove();
		System.out.println(s);
	}

}
