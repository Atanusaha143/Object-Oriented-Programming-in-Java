public class Book
{
	private String BookName;
	private String type;
	private String WritterName;
	private int regNo;
	public int noCopy;
	
	public Book()
	{
		BookName = "no name";
		type = "no type";
		WritterName = "no name";
		regNo = 0;
		noCopy = 0;
	}
	
	public Book (String BookName, String type, String WritterName, int regNo, int noCopy)
	{
		this.BookName = BookName;
		this.type = type;
		this.WritterName = WritterName;
		this.regNo = regNo;
		this.noCopy = noCopy;
	}
	
	void setAll(String BookName, String type, String WritterName, int regNo, int noCopy)
	{
		this.BookName = BookName;
		this.type = type;
		this.WritterName = WritterName;
		this.regNo = regNo;
		this.noCopy = noCopy;
	}
	
	
	void display()
	{
		System.out.println("Book Name: "+BookName);
		System.out.println("Book Type: "+type);
		System.out.println("Writter Name: "+WritterName);
		System.out.println("Reg No: "+regNo);
		System.out.println("No of Copies: "+noCopy);
	}
}