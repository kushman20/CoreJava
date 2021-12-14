package coreJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// this take key value pair
		HashMap<Integer,String> hm = new HashMap<Integer, String>();
		hm.put(0, "kushal");
		hm.put(1, "kati");
		hm.put(2, "janifer");
		hm.put(3, "jain");
		hm.put(4, "tresha");
		
		System.out.println(hm.get(2));
		hm.remove(3);
		System.out.println(hm.get(3));
		hm.put(3, "pandey");
		
		Set es=   hm.entrySet();
		
		Iterator i= es.iterator();
		
		while (i.hasNext())
		
		{
			//System.out.println(i.next());
			
		Map.Entry mp= (Map.Entry)i.next();
		System.out.println(mp.getKey());
		System.out.println(mp.getValue());
	}

}
}