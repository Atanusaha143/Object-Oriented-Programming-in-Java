import java.util.Scanner;

public class Main
{
	public static void main (String args[])
	{
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter name: ");
		String n = input.nextLine();
		//lec.name = n;
		
		System.out.println("Enter age: ");
		int a = input.nextInt();
		//lec.setAge(a);
		
		String escape = input.nextLine();
		
		System.out.println("Enter blood group: ");
		String b = input.nextLine();
		//lec.setBloodGroup(b);
		
		System.out.println("Enter depertment: ");
		String d = input.nextLine();
		//lec.setDept(d);
		Lecturer lec = new Lecturer(n,a,b,d);
		lec.display();
	}
}