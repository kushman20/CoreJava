package coreJava;

public class encapsulationEmployee {

	//Steps to achieve encapsulation
	//1. Declare the variable of a class as private
	//2.provide public Setter and Getter methods to modify and view variable values
	//3 now create another main class and create a object of this class and access and set the variable value through set method
	
	private int empid;
	
	public void setEmpid(int eid)
	{
		empid= eid;
	}
	
	public int getEmpid()
	{
		return empid;
	}
}
