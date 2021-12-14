package coreJava;

public class accessSpecifierDemo {

	
	 protected void newpro()
	{
		System.out.println("you can access protected method in the package as well as ouside the package by inherit it and import package");
		
	
	}
	
	private void newpri()
	 {
		System.out.println("You can not access private methods or variable outside the class of same package."); 
	 }
	
	void newdefault()
	{
		System.out.println("you can access default methods anywhere in same package class");
	}
	 
	public void newpub()
	{
		System.out.println("you can access  public method anywhere  to all packages");
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		accessSpecifierDemo as= new accessSpecifierDemo();
		
		as.newpri();
		as.newpub();
		as.newdefault();
		as.newpro();
		
	}

}
