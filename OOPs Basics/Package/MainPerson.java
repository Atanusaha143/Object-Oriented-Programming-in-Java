import PackagePerson.Person;
import java.util.Scanner;
public class MainPerson
{
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		Person p = new Person();
		Employee emp = new Employee();
		
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

		System.out.print("Phone Number: ");
		String phn = input.nextLine();
		emp.setPhnNo(phn);

		System.out.print("Email: ");
		String eml = input.nextLine();
		emp.setEmail(eml);
		
		p.displayPerson();
		emp.displayEmployee();
	}
}