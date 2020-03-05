import java.util.Scanner;

public class TaskString
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter 1st String: ");
		String s1 = input.next();
		System.out.print("Enter 2st String: ");
		String s2 = input.next();

		boolean equl = s1.equals(s2);
		if(equl) System.out.println("Strings are same");
		else if(s1.length()<s2.length()) System.out.println("1st string is smaller than 2nd");
		else System.out.println("2nd string is smaller than 1st"); 
	}
}