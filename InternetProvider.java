class InternetProvider
{
	String name;
	String address;
	String plan;
	double cost;
	public static void main(String a[])
	{
		InternetProvider internet = new InternetProvider();
		
		internet.name="Airtel";
		System.out.println("Internet Provider: "+internet.name);
		System.out.println();
		internet.address="Malleshwaram";
		System.out.println("Airtel office : "+internet.address);
		System.out.println();
		internet.plan="One Month";
		System.out.println("Internet Plan : "+internet.plan);
		System.out.println();
		internet.cost=150.50;
		System.out.println("Internet Cost :"+internet.cost);
		System.out.println();
		internet.serve();
	}
	void serve()
	{
		System.out.println("Servicing the customers with the best plan...!");
	}

}