class Matrix_Secondary_Line //Secondary_line
{
	static int j;
	public static void main(String a[])
	{
		for(int i=1; i<=4; i++)
		{			
			for(j=1; j<=4; j++)
			{
				if(j+i==5) 
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
}/* this is Secondary diagonal matrix*/