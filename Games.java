class Games
{
	static String name="Cricket";
	static int noOfPlayers=15;
	public static void main(String a[])
	{
		play();
		play(noOfPlayers);
		
	}
	public static void play()
	{
		System.out.println("Playing the ground ");
	}
	public static void play(int noOfPlayers)
	{
		System.out.println("Playing in the ground "+noOfPlayers+" Players ");
	}
}