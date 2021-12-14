package coreJava;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// can accept duplicate values
		//Arraylist,LinkedList, Vector - Implement the List Interface
		//Array have fixed size while Arraylist can grow Dynamically
		// you can access and insert any  value in any  index in arraylist
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Raj"); 
		a.add("Rahul");
	     a.add("Kushal");
	     a.add(0, "happy");
	     
	     System.out.println(a);
	     
	     System.out.println(a.get(1));
	     
	     System.out.println(a.contains("happy"));
	     
	     System.out.println(a.indexOf("Rahul"));
	     
	     System.out.println(a.isEmpty());
	     
	     System.out.println(a.size());
	     
	     System.out.println(a.clone());
	     
	   /*  ArrayList<String> b= new ArrayList<String>();
	     b.add("rathod");
	     b.add("Krishna");
	     b.add("pritam");
	     
	     a.addAll(b);
	     */
	
	     System.out.println(a);
	     
	    Iterator<String> it= a.iterator();
	    
	    while (it.hasNext())
	    System.out.println(it.next());
	    
	     
	     
	     
	
				
	}

}
