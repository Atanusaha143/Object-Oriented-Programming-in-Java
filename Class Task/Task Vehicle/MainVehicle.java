import java.util.Scanner;

public class MainVehicle
{
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		
		Vehicle veh = new Vehicle();
		
		System.out.print("Enter Type of Vehicle: ");
		String type = input.nextLine();
		veh.typeOfVehicle = type;
		
		System.out.print("Enter Name: ");
		String s = input.nextLine();
		veh.name = s;
		
		System.out.print("Enter Num. of Wheels: ");
		int wheel = input.nextInt();
		veh.numOfWheels = wheel;

		System.out.print("Enter Num. Of Doors: ");
		int door = input.nextInt();
		veh.numOfDoors = door;
		
		veh.displayVehicle();
	}
}
