package coreJava;

public class Animal {
	
	int a,b,c;

	public Animal()
	
	
	{
		int a=5, b=7 , c=a+b;
		this.a= a;
		this.b= b;
		this.c=c;
		System.out.println(c);
		System.out.println("I am constructor of Animal class");
	}

	public void eat()
	{
		System.out.println("I can eat ");
		System.out.println("**********");
	}
}
