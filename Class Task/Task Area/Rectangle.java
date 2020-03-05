public class Rectangle
{
	public double height;
	public double width;
	public double area;
	
	public Rectangle()
	{}
	
	public Rectangle(double height, double width)
	{
		this.height = height;
		this.width = width;
	}
	
	void calculation()
	{
		area = height * width;
	}
	
	public void displayArea()
	{
		System.out.println("Rectangle Area: "+area);
	}
}
