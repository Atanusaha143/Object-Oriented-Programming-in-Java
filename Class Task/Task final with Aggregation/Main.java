import java.util.Scanner;

public class Main
{
	public static void main (String args[])
	{
		Scanner cin = new Scanner(System.in);
		
		System.out.println("Enter Registration No. :");
		int regNo = cin.nextInt();
		
		System.out.println("Enter Engine No. :");
		int egNo = cin.nextInt();
		
		System.out.println("Enter Plate No. :");
		int pltNo = cin.nextInt();
		
		Confidential cnf = new Confidential(regNo, egNo, pltNo);
		
		System.out.println("Enter Vehicle Name: ");
		String name  = cin.next();
		
		System.out.println("Enter Vehicle Color: ");
		String color  = cin.next();
		
		System.out.println("Enter Model No: ");
		int mNo  = cin.nextInt();
		
		Vehicle vec = new Vehicle(name, color, mNo, cnf);
		
		vec.display();
	}
}