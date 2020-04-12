import java.util.*;

public class Main
{
	public static void main (String args[])
	{
		Scanner cin = new Scanner (System.in);
		
		Write w = new Write();
		System.out.print("Write a line here: ");
		
		String s = cin.nextLine();
		w.Writing(s);
	}
}