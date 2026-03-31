package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSetMethods {

	public static void main(String[] args) {
		Set <String> s = new HashSet <String>();
		 
		//1.add() method
		s.add("Red");
		s.add("Blue");
		s.add("Yellow");
		System.out.println(s);
		
		//2.addAll()	used to add/merge to list
		Set <String> s1 = new HashSet <String>();
		
		s1.add("Purple");
		s1.add("Black");
		
		s.addAll(s1);
		System.out.println(s);
		
		//3.contains()
		System.out.println(s.contains("Blue"));
		
		//4.containsAll() used to check whether all the elements of one set is contained in another set
		System.out.println(s1.containsAll(s));
		
		//5. isEmpty()
		System.out.println(s.isEmpty());

		//6. remove()
		s.remove("purple");
		System.out.println(s);
		
		//7.reomveAll() used to remove all elements from one set
		s.remove(s1);
		System.out.println(s);
		
		//8. size()
		System.out.println(s1.size());
		
		//9.clear() to delete all the elements but the structure remains
		s.clear();
		System.out.println(s);
		
	
	}

}
