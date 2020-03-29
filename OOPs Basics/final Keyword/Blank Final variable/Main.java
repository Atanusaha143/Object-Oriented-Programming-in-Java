import java.util.Scanner;

public class Main 
{
	public static void main (String args[])
	{
		Scanner cin = new Scanner (System.in);
		
		System.out.print("Enter Name: ");
		String name = cin.next();
		
		System.out.print("Enter Fees: ");
		int fees = cin.nextInt();
		
		BlankFinal bf = new BlankFinal(name, fees);
		bf.display();
	}
}