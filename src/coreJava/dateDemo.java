package coreJava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// current date 
		Date d = new Date();
		System.out.println(d.toString());
		
		// Another way is SimpleDateFormat we can customize the date format
		
		//M	Month in year
		//d	Day in month
		//y	Year in four digits
		//h	Hour in A.M./P.M. (1~12)
		//E	Day in week
		//D	Day in year
		SimpleDateFormat sdf= new SimpleDateFormat("M/d/y , h , E , D  hh:mm:ss");
		System.out.println(sdf.format(d));
		
		
		
		

	}

}
