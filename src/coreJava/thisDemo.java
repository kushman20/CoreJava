package coreJava;

public class thisDemo {
	
	
	int a=2; // these is global variable
	
	public void getData()
	{
		int a=3; // --> these variable is having scope till this method only
		
		System.out.println(a);
		System.out.println(this.a); // to use same variable we use this keyword from global variable
		
		// if you want to sum the both a then how?
		
		int b = a+ this.a;
		System.out.println(b);
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		thisDemo t= new thisDemo();
		t.getData();
		

}
}