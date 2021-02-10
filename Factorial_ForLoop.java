class Factorial_ForLoop
{
	public static void main(String hsdg[])
	{
		myFact(5);
	}
	
		public static void myFact(int num)
		{
			int fact=1;
			for(int i=1; i<=num; i++)
			{
				fact=fact*i;  
				System.out.println("Factorial Number is:  "+fact);
			}
	
	}
			
}