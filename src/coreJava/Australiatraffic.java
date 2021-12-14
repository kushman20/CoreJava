package coreJava;

public class Australiatraffic implements centraltrafficInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		centraltrafficInterface a = new Australiatraffic(); // to implement interface create object
		Australiatraffic at= new Australiatraffic();
		a.redstop();
		a.greengo();
		a.yellowhalt();
		at.walkRule();
		
	}

	@Override
	public void redstop() {
		// TODO Auto-generated method stub
		System.out.println("Red Light interface traffic rule implemented ");
	}

	@Override
	public void greengo() {
		// TODO Auto-generated method stub
		System.out.println("Green light interface rule implemented");
	}

	@Override
	public void yellowhalt() {
		// TODO Auto-generated method stub
		System.out.println("Yellow light traffic interface rule implemented");
	}
	
	public void walkRule()
	{
		System.out.println("walk as per rule");
	}

}
