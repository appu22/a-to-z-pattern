class Browser
{
	String name;
	public static void main(String a[])
	{
		Browser browser= new Browser();
		browser.name="FireFox";
		System.out.println(browser.name);
		browse();
		
		Browser browser1 = new Browser();
		browser1.name="Microsift Edge";
		System.out.println(browser1.name);

		browser.browse1();
		Browser browser2= new Browser();
		browser2.name="Google Chrome";
		System.out.println(browser2.name);
		
		
		Browser browser3=new Browser();
		browser3.name="Operamini";
		System.out.println(browser3.name);
	}
	static void browse()
	{
		System.out.println("Browse about GitHub");
	}
	void browse1()
	{
		System.out.println("is this Security to browse Google Chorme ? ");
	}
	
}
		