class MetroStations
{
	String name;
	int price;
	public static void main(String a[])
	{
		MetroStations metrostation = new MetroStations();
		metrostation.name="majestic";
		metrostation.price=15;
		System.out.println("Mantri Square to "+ metrostation.name+ "  Price Rs " +metrostation.price );
		metrostation.transport();
		
		MetroStations metrostation1= new MetroStations();
		metrostation1.name="hosahalli metro";
		metrostation1.price=25;
		System.out.println(metrostation.name+ " to "+metrostation1.name+"  Rs  "+ metrostation1.price);
				
	}
	void transport()
	{
		System.out.println("Happy Journey.......!");
	}
}
	