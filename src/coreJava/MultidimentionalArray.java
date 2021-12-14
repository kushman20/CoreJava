package coreJava;

public class MultidimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*2 4 7
		3 5 6*/
		
		int a[][] = new int[2][3];
		a[0][0]= 2;
		a[0][1]=4;
		a[0][2]=7;
		a[1][0]=3;
		a[1][1]=5;
		a[1][2]=6;
		
		//another way of represtation direct assigning values to arrays
		//int b[][]	=	{ {2,4,7},{3,5,6}};
		//System.out.println(b[0][1]);
		
		for (int i=0;i<2;i++)  //--outer for loop stand for row
		{

			for (int j=0;j<3;j++) // -- inner for loop stands for column
			{
				System.out.print(a[i][j]);
				System.out.print("\t");
				
			}
		System.out.println("");
		}
	}

}
