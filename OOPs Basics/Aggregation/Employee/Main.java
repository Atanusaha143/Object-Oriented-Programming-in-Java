import java.util.Scanner;

public class Main
{
	public static void main (String args[])
	{
		Scanner cin = new Scanner(System.in);
		
		System.out.print("Enter Name: ");
		String name = cin.next();
		
		System.out.print("Enter Age: ");
		int age = cin.nextInt();
		
		System.out.print("Enter Email: ");
		String email = cin.next();
		
		System.out.print("Enter ID: ");
		String id = cin.next();
		
		System.out.print("Enter Designation: ");
		String designation = cin.next();
		
		System.out.println("Enter Address: ");
		System.out.print("Enter House No. : ");
		int hNo = cin.nextInt();
		
		System.out.print("Enter Road No. : ");
		int rNo = cin.nextInt();
		
		System.out.print("Enter House Name: ");
		String hName = cin.next();
		
		Address ad = new Address(hNo, rNo, hName);
		
		Employee emp = new Employee(name, age, email, id, designation, ad);
		
		emp.display();
	}
}