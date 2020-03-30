public class Vehicle
{
	private String name;
	private String color;
	private static final double speedLimit;
	private final int modelNo;
	private Confidential data;
	
	public Vehicle()
	{
		modelNo = 0;
	}
	
	public Vehicle(String name, String color, int modelNo, Confidential data)
	{
		this.name = name;
		this.color = color;
		this.modelNo = modelNo;
		this.data = data;
	}
	
	static
	{
		speedLimit = 50;
	}
	
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Color: "+color);
		System.out.println("Speed Limit: "+speedLimit);
		System.out.println("Model No. : "+modelNo);
		System.out.println("Confidential: ");
		System.out.println("		Registration No. : "+data.getRegistrationNo());
		System.out.println("		Engine No. :"+data.getEngineNo());
		System.out.println("		Plate No: "+data.getPlateNo());
	}
}