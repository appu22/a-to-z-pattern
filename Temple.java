class Temple
{
	public static void main(String a[])
	
	{
		puja();
		puja("Ganesh");
	}
	public static void puja()
	{
		String timings="6 to 8";
		System.out.println("Puja timings:"+ timings);
	}
	//method overriding 
	public static void puja(String name)
	{
		String timings="9 to 8";
		System.out.println("Puja timings :"+ timings+"LOrd Ganesh Temple Malleshwaram Bnglr"+name);
	}
}
