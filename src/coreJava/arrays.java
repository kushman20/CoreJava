package coreJava;

import java.util.Arrays;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[5];
		
		a[0]= 5;
		a[1]=2;
		a[2]=0;
		a[3]=9;
		a[4]=6;//initialise values in array
		
		for (int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+"\t");
		}
		System.out.println("*********");
		//or
		int b[]= {2,3,4,5,6,7,8,9,0,2};
		
		for (int i=0;i<b.length;i++)
		{
			
			System.out.print(b[i]); // Retrieve values in arrays
			System.out.print("\t");
			
		}

		String str[] = new String[5];
		str[0]= "kushal";
		str[1]="naveen";
		str[2]="ram";
		str[3]="rajiv";
		str[4]="rakesh";
		
		for (int j=0;j<str.length;j++)
		{
			System.out.println("");
			System.out.println(str[j]);
			
		}
	}

}
