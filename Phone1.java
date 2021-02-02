class Phone1
{
	static double price=25000.00;
	public static void main(String a[])
	{
		double total=ring(price);
		System.out.println("Samsung Phone Price "+total );
		System.out.println("");
		ring("massy");
		System.out.println("");
		call(821232343l);//long no =call(4564756348l); sop(no)
		System.out.println("");
		call("appu");
	}
	public static double ring(double price)
	{
		return price;
	}
	static void ring(String songs)
	{
		System.out.println("Ringtone is "+songs);
	}
				/*public static long call(long no)
				{
					return no;
				}
					*/
	public static void call(long no)
	{
		System.out.println("Contact Number  "+no);
	}
	static void call(String name)
	{
		System.out.println("Contact Name"+name);
	}
}