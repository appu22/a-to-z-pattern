class InternetTester
{
	public static void main(String a[])
	{
		InternetProvider_Class_File internet = new InternetProvider_Class_File();
		
		//internet.name="Airtel";
		//System.out.println("Internet Provider: "+internet.name);
		System.out.println();
		internet.address="Malleshwaram";
		System.out.println("Airtel office : "+internet.address);
		System.out.println();
		internet.plan="One Month";
		System.out.println("Internet Plan : "+internet.plan);
		System.out.println();
		internet.cost=150.50;
		System.out.println("Internet Cost :"+internet.cost);
		
		
		
		InternetProvider_Class_File internet1 = new InternetProvider_Class_File();
		
		//internet1.name="Airtel";
		//System.out.println("Internet Provider: "+internet1.name);
		System.out.println();
		internet1.address="Belagavi";
		System.out.println("Airtel office : "+internet1.address);
		System.out.println();
		internet1.plan="4 Month";
		System.out.println("Internet Plan : "+internet1.plan);
		System.out.println();
		internet1.cost=599.50;
		System.out.println("Internet Cost :"+internet1.cost);
		
		
		InternetProvider_Class_File internet2 = new InternetProvider_Class_File();
		
		//internet2.name="Airtel";
		//System.out.println("Internet Provider: "+internet2.name);
		System.out.println();
		internet2.address="Bengalore";
		System.out.println("Airtel office : "+internet2.address);
		System.out.println();
		internet2.plan="three Month";
		System.out.println("Internet Plan : "+internet2.plan);
		System.out.println();
		internet2.cost=399.50;
		System.out.println("Internet Cost :"+internet2.cost);
		System.out.println(InternetProvider_Class_File.name);
		InternetProvider_Class_File.serve();
	}
}