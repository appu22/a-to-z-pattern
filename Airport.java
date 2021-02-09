class Airport
{
	String airportName;
	int noOfTerminals;
	String source;
	String destination;
	
	public static void main(String a[])
	{
		Airport airport = new Airport();
		System.out.println("Welcome To Airport");
		System.out.println();
		airport.airportName="Kempegouda International Airport";
		airport.noOfTerminals=32;
		airport.source="Bengalore";
		airport.destination="Dubai";
		System.out.println("Airport Name: "+airport.airportName+" "+airport.noOfTerminals+" Terminals");
		System.out.println();
		System.out.println("Transporting: "+airport.source+" to  "+airport.destination);
		System.out.println();
		airport.checking();
		System.out.println("Thank You and Visiting again....");
	}
	 void checking()
	{
		System.out.println(" Checking the Passengers..... ");

	}
}


