package coreJava;

import java.util.HashSet;
import java.util.Iterator;

public class hasSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // HashSet,treeSet, LinkedHashSet implements Set Interface
		// can not have duplicate values
	// there is no guarantee that element will stored in sequential order..stored in random order
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("US");
		hs.add("UK");
		hs.add("India");
		hs.add("India");  // trying to add duplicate value but result will show only one
		hs.add("ruhi");
		hs.add("priya");
		hs.add("zula");
		System.out.println(hs.isEmpty());
		System.out.println(hs);
		System.out.println(hs.size());
		//System.out.println(hs.remove("India"));
		System.out.println(hs.size());
		
		Iterator<String> i= hs.iterator();
		while (i.hasNext())
		{
	 System.out.println(i.next());
	 
		
		}
		
	
		
	}

}
