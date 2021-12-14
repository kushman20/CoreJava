package coreJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Calendar	cal=Calendar.getInstance();
	System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	SimpleDateFormat sf= new SimpleDateFormat("M/d/y hh:mm:ss");
	System.out.println(sf.format(cal.getTime()));
	
	
	System.out.println(cal.get(Calendar.MINUTE));
	}
	

}
