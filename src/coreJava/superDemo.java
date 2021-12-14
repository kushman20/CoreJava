package coreJava;

public class superDemo extends superParentDemo {

	public superDemo()
	{
		super(); // this should always be the first line.it will call parent constructor
		System.out.println(" this is child constructor");
	}
	
	
	String name="This is child";
	
      
      
	public void getStringdata()
	{
		super.getStringdata();
		System.out.println(super.name);//this will get the data from parent as super keyword used
		System.out.println(name);
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		superDemo sd= new superDemo();
		sd.getStringdata();
	}

}
