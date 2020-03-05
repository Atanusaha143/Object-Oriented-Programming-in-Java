public class Library
{
	private String LName;
	private String LAddress;
	private int LCapacity;
	public Book list[];
	
	public Library()
	{}
	
	public Library(String LName, String LAddress, int LCapacity)
	{
		this.LName = LName;
		this.LAddress = LAddress;
		this.LCapacity = LCapacity;
	}
	
	void setCap(int n)
	{
		list = new Book[n];
	}
	
	public void addBook(Book info, int idx)
	{
		list[idx] = info;
	}
	
	void setAll(String LName, String LAddress, int LCapacity)
	{
		this.LName = LName;
		this.LAddress = LAddress;
		this.LCapacity = LCapacity;
	}
	
	void print()
	{
		System.out.println("Library Name: "+LName);
		System.out.println("Library Address: "+LAddress);
		System.out.println("Library Capacity: "+LCapacity);
	}
	
	void printAll()
	{
		for(int i=0; i<list.length; i++)
		{
			System.out.println("Book "+i+" Details: ");
			list[i].display();
		}
	}
}