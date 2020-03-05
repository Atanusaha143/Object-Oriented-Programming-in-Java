import PackageInheritance.Teacher;
import java.util.Scanner;
public class MainInheritance
{
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		String n = input.nextLine();
		System.out.print("Enter age: ");
		int a = input.nextInt();
		String escape = input.nextLine();
		System.out.print("Enter info: ");
		String info = input.nextLine();

		Teacher tea = new Teacher();
		
		tea.name = n;
		tea.age = a;
		tea.information = info;
		
		tea.displayInformation2();
	}
}