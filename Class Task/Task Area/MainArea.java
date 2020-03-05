import java.util.Scanner;

public class MainArea
{
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Choose an option: ");
		System.out.println("(1) Rectangle ");
		System.out.println("(2) Square ");
		System.out.println("(3) Circle ");
		System.out.print("Enter your choice: ");
		
		int n = input.nextInt();
		switch(n)
		{
			case 1:
		{
			Rectangle rec = new Rectangle(); 
			System.out.print("Enter height for Rectangle: ");
			double h = input.nextInt();
			rec.height = h;
			
			System.out.print("Enter width for Rectangle: ");
			double w = input.nextInt();
			rec.width = w;
			rec.calculation();
			rec.displayArea();
			
			break;
		}
		
		case 2:
		{
			Square sqr = new Square(); 
			System.out.print("Enter length for Square: ");
			double l = input.nextInt();
			sqr.length = l;
			sqr.calculation();
			sqr.displayArea();
			
			break;
		}
		
		case 3:
		{
			Circle crl = new Circle(); 
			System.out.print("Enter radius of Circle: ");
			double r = input.nextInt();
			crl.radius = r;
			crl.calculation();
			crl.displayArea();

			break;
		}
		
		default:
		{
			System.out.println("You have choosen an unknown option");
		}
		}
	}
}
