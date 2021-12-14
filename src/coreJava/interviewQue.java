package coreJava;

public class interviewQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 3	6	7
		 7	9	6
		 5	0	8*/
		
	// to find the max number in the column in the which there is min number i.e 9
		//step first find the min number
		// then find the colum
		// then find the max number in column
		
		int b[][]= {{3,0,7},{7,9,9},{5,12,8}};
		int min= b[0][0];
		int mincolumn=0;
		
		for (int i=0;i<3;i++)
		{
			
			for (int j=0;j<3;j++) 
			{
				
				if( b[i][j]< min)
				{
					min= b[i][j];
					mincolumn= j;
				//System.out.println("min column number is "+ mincolumn);
				}
				
			}
			

		}
		// value of mincolumn is now 1
  int maxnum = b[0][mincolumn];
int k = 0;
 while (k<3)
   {
	 // here we need to increase the row number so k will increase as 0,1,2 and 
	 //mincolumn will remain 1 for example [0][1],[1][1],[2][1]
	if(b[k][mincolumn] > maxnum)
	{
	maxnum= b[k][mincolumn];
    }
		
	k++;

	}
	System.out.println(maxnum);	
	
}
}
