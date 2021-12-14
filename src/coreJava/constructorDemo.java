package coreJava;

public class constructorDemo {

	public constructorDemo()
	{
		System.out.println(" I am  in constructor");
	}
	
	// Another type is parameterized constructor
	
	public constructorDemo(int a, int b)
	{
		System.out.println(" I am  in parameterized constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Constructor executes a block of code whenever an object is created
				//  1. constructor will not return any values
				//2. constructor should be same as the name of of class name
				//compiler will call implicit constructor if you have not defined any constructor
		//
		//
		constructorDemo cd= new constructorDemo();
		
		// for parameterized constructor you should pass argument
		constructorDemo c= new constructorDemo(4,5);
		
	}

}
