package Exmpl;

public class Vehicle
{
	public String name;
	public double weight;
	
	public Vehicle (String n, double w)
	{
		name = n;
		weight = w;
	}
	
	public void display()
	{
		System.out.println("Name: "+name+"\nWeight: "+weight);
	}
}