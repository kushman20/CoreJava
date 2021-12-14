package coreJava;

public class exceptionDemo {
// can have multiple catch method for a single try block
	int a=4;
	int b=7;
	
	int c=0;
	
	public void getdata()
	
	{
		try {
		// below code can be catch at arithmatic but all can be catch at exception
		int k=b/c;
			System.out.println(k);
		//below code can be catch at outof bound	
			int arr[]= new int [5];
			System.out.println(arr[7]);
	}
	
		
	catch (ArithmeticException et)
		{
			System.out.println("if arithmatic catch here ");
		} 
			catch (IndexOutOfBoundsException ets)
		{
		 System.out.println(" I catch outof bound exception");
		}
	
	catch (Exception e)
	{
		System.out.println("Error: this is arithmetic error cant process");
		
	}
		finally
		{
			// this block is executed irrespective of error thrown or not 
			// its written with try and catch block
			// even if there is no catch finally will execute
			//The finally block always executes immediately after try-catch block exits.
			//The finally block is executed incase even if an unexpected exception occurs.
			System.out.println("Finally can use to delete cookies or close browser");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		exceptionDemo ed = new exceptionDemo();
				ed.getdata();

	
	}

}
