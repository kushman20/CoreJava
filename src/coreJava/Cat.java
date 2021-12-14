package coreJava;

public class Cat extends Dog{

	
		// multi level inheritance
	//costructor cant be called through inhertance
	// private method cant be call through inheritance
		public void chicken()
		{
			System.out.println("I can eat chick");
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Animal a= new Animal();
			a.eat();
			
			
			Dog d= new Dog();
			d.eat();
			d.walk();
			
			Cat c= new Cat();
			c.eat();
			c.walk();
			c.chicken();
			
			

			
			
		}
	}
	
