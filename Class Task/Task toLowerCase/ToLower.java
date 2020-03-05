import java.util.Scanner;

public class ToLower
{
	public static void main(String args[])
	{
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a string in Upper case: ");
		String s1 = input.nextLine();

		System.out.println("In lower case it is: "+s1.toLowerCase()); 
	}
}