import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class MainStr
{
	public static void main (String args[])
	{
		Scanner input = new Scanner (System.in);

		Str s = new Str();

		String indx = "Enter String for index ";
		int arrlen = s.getArraySize();
		System.out.println("Enter Strings: ");
		for(int i=0; i<arrlen; i++)
		{
			System.out.print(indx+i+" : ");
			String m = input.nextLine();
			s.addMsg(i,m);
		}
		s.preDisplay();

		System.out.print("Enter index you wnat to delete string from: ");
		int idx = input.nextInt();
		s.deleteMsg(idx);

		System.out.println("After deletion the string array is: ");
		s.nextDisplay();
	}
}