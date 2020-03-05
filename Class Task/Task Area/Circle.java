import java.lang.Math;

public class Circle
{
	public double radius;
	public double area;
	
	public Circle()
	{}
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	void calculation()
	{
		area = Math.PI * (radius * radius);
	}
	
	public void displayArea()
	{
		System.out.println("Circle Area: "+area);
	}
	
}