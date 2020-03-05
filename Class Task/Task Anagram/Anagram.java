import java.util.Scanner;
import java.util.Arrays;

public class Anagram
{
	public static void main(String args[])
	{
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter 1st String: ");
		String s = input.nextLine();
		System.out.print("Enter 2nd String: ");
		String ss = input.nextLine();
		
		s = s.replaceAll("\\s","");
		ss = ss.replaceAll("\\s","");
		boolean flag = false;

		if(s.length()!=ss.length())
		{
			System.out.println("No, They is not Anagram");
		}
		else
		{
			char c1[] = s.toLowerCase().toCharArray();
			char c2[] = ss.toLowerCase().toCharArray();

			Arrays.sort(c1);
			Arrays.sort(c2);
			
			flag = Arrays.equals(c1,c2);

			if(flag) System.out.println("Yes, they is Anagram");
			else System.out.println("No, They is not Anagram");
		}
	}
}
