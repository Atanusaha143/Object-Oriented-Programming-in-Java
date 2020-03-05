import java.util.Scanner;

class Main
{
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number Of Inputs: ");
		int n = input.nextInt();
		
		Emp arr[] = new Emp[n];
		
		for(int i=0; i<n; i++)
		{
			System.out.print("Enter Details for Emplyoee "+i+" : ");
			
			System.out.println("Enter Name: ");
			String nam = input.nextLine();
	
			
			System.out.print("Enter Age: ");
			int boyosh = input.nextInt();
			
			System.out.print("Enter ID: ");
			int card = input.nextInt();
			
			arr[i] = new Emp(nam,boyosh,card);
		}
		
		for(int i=0; i<n; i++)
		{
			arr[i].show();
		}
	}
}