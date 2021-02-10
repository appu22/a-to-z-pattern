class Matrix_Primary_Line //Primary_line
{
	static int j;
	public static void main(String a[])
	{
		for(int i=1; i<=4; i++)
		{			
			for(j=1; j<=4; j++)
			{
				if(i==j) 
				{
					 System.out.print("*");
				}
				else
				{
					 System.out.print("  ");
				}					
			}
			 System.out.println();
		}
	}
}
/* this is Primary_diagonal line */