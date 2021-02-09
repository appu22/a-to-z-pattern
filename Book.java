class Book
{
String name;
double price;
	public static void main(String a[])
	{
		//ClassName refernce = new ClassName();
		Book book = new Book();
		book.name="Java";
		book.price=80.00;
		System.out.println(book.name +"  "+book.price);
		Book book1 = new Book();
		book1.name="5pointsomeone";
		book1.price=500.00;
		System.out.println(book1.name +"  "+book1.price);
	}
}