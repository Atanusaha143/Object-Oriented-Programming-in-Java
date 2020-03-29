import java.util.Scanner;

public class Student
{
	private String name ;
	private String id ;
	private static final int totalNumberOfStudents ;
	private final int midBonusMark = 2 ; 
	
	
	public Student(String name, String id)
	{
		this.name = name ;
		this.id = id ;
	}
	
	static
	{
		totalNumberOfStudents = 40 ; 
	}
	void display()
	{
		System.out.println("Name: "+name) ;
		System.out.println("ID: "+id) ;
		System.out.println("Total Number of Students: "+totalNumberOfStudents) ;
		System.out.println("Bonus mark is : "+midBonusMark) ;
	}
	
	public static void main(String arg[])
	{
		Scanner cin = new Scanner(System.in);
		
		System.out.print("Enter Name: ");
		String name = cin.next();
		
		System.out.print("Enter ID: ");
		String id = cin.next();
		
		
		Student s = new Student(name, id) ;
		s.display() ;
	}
}