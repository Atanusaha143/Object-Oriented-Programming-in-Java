import mypackage.Person;
import java.util.Scanner;

public class MainPerson
{
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		Person p = new Person();
		
		System.out.print("Enter Name: ");
		String n = input.nextLine();
		p.name = n;
		
		System.out.print("Enter Age: ");
		int a = input.nextInt();
		p.setAge(a);
		
		String escape = input.nextLine();
		
		System.out.print("Enter Blood Group: ");
		String b = input.nextLine();
		p.bloodGroup = b;
		
		p.display();
	}
}