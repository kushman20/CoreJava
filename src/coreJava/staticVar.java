package coreJava;

public class staticVar {

	String name; // this are instance variable
	String address;
	//static String city = "Bhopal";
	//All static variable are class variable and not depend on instance(obj)
	static String city;

	static {
		city="Bhopal"; // can also declare static variable in block
	}
	 staticVar(String name, String address)
	{
		//System.out.println(name);
		this.name=name; // here name is local variable
		this.address=address;

	}
	
	 public void getaddress()
	 {
		 System.out.println(name+ "" + address);
		 System.out.println(city);
	 }
	 
	 public static void getcity()
	 {
		 System.out.println(city); // static method only allows static variable
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		staticVar obj= new staticVar("ramesh", "gulmohar colony" );
		staticVar obj1= new staticVar("peter", "katra");
		obj.getaddress();
		obj1.getaddress();
		staticVar.getcity(); // call static method using classname.static method . no need to call using instance.
	}

}
