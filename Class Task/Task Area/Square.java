public class Square
{
	public double length;
	public double area;
	
	public Square()
	{}
	
	public Square(int length)
	{
		this.length = length;
	}
	
	void calculation()
	{
		area = length * length;
	}
	
	public void displayArea()
	{
		System.out.println("Square Area: "+area);
	}
}