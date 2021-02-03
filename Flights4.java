class Flights4
{
	static String name[]={"KingFisher","Deccan","SpiceJet","Airaisa"};
	static int noOfSeats[]={250,500,1000,3500};
	public static void main(String a[])
	{
		/*
		for(int i=0;i<4;i++)
		{
			System.out.println(name[i]);
		}
		for(int i=0;i<4;i++)
		{
			System.out.println(noOfSeats[i]);
		}*/
		for(int i=0;i<4;i++)
		{
			System.out.println(name[i]+"No Of Seats = "+noOfSeats[i]);
			//System.out.println(noOfSeats[i]);
		}
		
	}	
}