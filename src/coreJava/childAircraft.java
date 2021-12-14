package coreJava;

public class childAircraft extends parentAircraft{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		childAircraft ca= new childAircraft();
		ca.Engine();
		ca.guidline();
		ca.color();
	
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
	
			System.out.println("color is Red");
		}

	}

	

