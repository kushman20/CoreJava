package coreJava;

public class superParentDemo {

	public superParentDemo()
	
	{
		System.out.println("This is parent constructor");
	}
	String name="This is Parent";
	
	public void getStringdata()
	{
		
		System.out.println(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		superParentDemo gd= new superParentDemo();
	}

}
