import java.util.Scanner;

public class Main
{
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter No. of student: ");
		int no = input.nextInt();
		
		Student stu[] = new Student[no];
		
		String escape = input.nextLine();
		
		for(int i=0; i<no; i++)
		{	
			System.out.println("Round "+i);
			
			System.out.print("Enter name: ");
			String n = input.nextLine();
			
			System.out.print("Enter age: ");
			int a = input.nextInt();
			
			String escape2 = input.nextLine();
			
			System.out.print("Enter mail: ");
			String m = input.nextLine();
			
			stu[i] = new Student();
			stu[i].setNameAgeMail(n,a,m);
		}
		
		System.out.println();
		for(int i=0; i<no; i++)
		{
			System.out.println("Student no: "+i);
			stu[i].display();
		}
	}
}