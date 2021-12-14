package coreJava;

public class findMinNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*8 3 5
		4 5 7
		3 2 1 
		*/
		int a[][]= {{8,3,5},{4,5,7},{3,2,1}};
		int min= a[0][0];
		
		
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				if (a[i][j]<min)
				{
					min=a[i][j];
					
				}
			}
		
	    }
		System.out.println(min);

}
}
