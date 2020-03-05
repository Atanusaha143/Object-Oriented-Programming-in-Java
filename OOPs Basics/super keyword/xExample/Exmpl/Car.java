package Exmpl;

public class Car extends Vehicle
{
	public int speed;
	
	public Car (String x, double y, int s)
	{
		super(x,y);
		speed = s;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Speed: "+speed);
	}
}