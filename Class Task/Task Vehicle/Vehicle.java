public class Vehicle
{
	public String typeOfVehicle;
	public String name;
	public int numOfWheels;
	public int numOfDoors;
	
	public Vehicle()
	{}
	
	public Vehicle(String typeOfVehicle, String name, int numOfWheels, int numOfDoors)
	{
		this.typeOfVehicle = typeOfVehicle;
		this.name = name;
		this.numOfWheels = numOfWheels;
		this.numOfDoors = numOfDoors;
	}
	
	public void displayVehicle()
	{
		System.out.println("Type of Vehicle: "+typeOfVehicle+"\nVehicle Name: "+name+"\nNum of Wheels: "+numOfWheels+"\nNum Of Doors: "+numOfDoors);
	}
}