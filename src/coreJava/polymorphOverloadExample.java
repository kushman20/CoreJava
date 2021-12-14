package coreJava;

public class polymorphOverloadExample extends polyOverride{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Function overloading means same class has methods with same name
	// we can achieve this by either
	//1.  Either argument count should be different
	//2. Either data type should be different
		
		
		polymorphOverloadExample g= new polymorphOverloadExample();
		g.getdata("hello",2);
		g.gedata("hello");
		g.getdata(5, "hello");
	//below ovverride child method called	
		g.audioSystem();
		
		//below override parent method called
		polyOverride p = new polyOverride();
		p.audioSystem();
		
	}
	public void getdata( int a, String b)
	{
		System.out.println(" First method");
	}
	
	public void getdata( String a, int b)
	{
		System.out.println("Second Method");
		
	}
	public void gedata(String c)
	{
		System.out.println("third method");
	}
	
	public void audioSystem()
	{
		// when parent and child both have method with same name everything same and we call a method in child class 
		//after inherit parent then child method will get preference
		
		System.out.println("this is child audio");
	}
}
