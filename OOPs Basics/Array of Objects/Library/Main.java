import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		Library lib = new Library();
		//Book b = new Book();
		
		System.out.print("Enter Library Name: ");
		String LName = input.nextLine();
		
		System.out.print("Enter Library Address: ");
		String LAddress = input.nextLine();
		
		System.out.print("Enter Library Capacity: ");
		int LCapacity = input.nextInt();
		
		String escape = input.nextLine();
		
		lib.setCap(LCapacity);
		lib.setAll(LName,LAddress,LCapacity);
		
		for(int i=0; i<LCapacity; i++)
		{
			System.out.println("Enter Book: "+i+" Details: ");
			
			System.out.print("Enter Book Name: ");
			String n = input.nextLine();
			
			System.out.print("Enter Book Type: ");
			String t = input.nextLine();
			
			System.out.print("Enter Book Writter Name: ");
			String w = input.nextLine();
			
			System.out.print("Enter Book Reg No: ");
			int r = input.nextInt();
			
			System.out.print("Enter No of Coppies: ");
			int c = input.nextInt();
			
			Book b = new Book(n,t,w,r,c);
			lib.addBook(b,i);
		}
		
		System.out.println();
		
		lib.print();
		lib.printAll();
		
	}
}