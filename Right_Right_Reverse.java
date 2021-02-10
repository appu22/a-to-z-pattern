class Right_Right_Reverse // right angle and right reverse
{
	public static void main(String a[])
	{
		for(int i=0; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		for(int i=0; i<=4; i++)
		{
			for(int j=4; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
}