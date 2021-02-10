class Right_Reverse_Angle  //Right Reverse angle
{
	public static void main(String a[])
	{
		for(int i=1; i<=4; i++)
		{
			for(int j=4; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}