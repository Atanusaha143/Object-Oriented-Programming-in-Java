import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class MainStudent
{
	public static void main (String args[])
	{
		Scanner input = new Scanner (System.in);

		Student s = new Student();

		System.out.print("Enter name: ");
		String n = input.nextLine();
		s.setName(n);

		System.out.print("Enter ID: ");
		int j = input.nextInt();
		s.setId(j);

		System.out.print("Enter CGPA: ");
		double c = input.nextDouble();
		s.setCgpa(c);

		String indx = "Enter mark for index ";
		int arrlen = s.getArraySize();
		System.out.println("Enter marks: ");
		for(int i=0; i<arrlen; i++)
		{
			System.out.print(indx+i+" : ");
			int m = input.nextInt();
			s.setMarks(i,m);
		}

		s.display();
	}
}