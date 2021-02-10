class Factorial_WhileLoop
{
	public static void main(String a[])
	{
		myFact(4);
	}
	
	public static void myFact(int number)
	{
		int fact=1;
		int i=1;
		while(i<=number)
		{
			fact=fact*i;
			i++;
		}
		System.out.println(fact);
	}
}	