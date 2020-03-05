// Author: Atanu Saha
public class Employee
{
	public String name;
	private double cgpa;
	private int age;
	
	public Employee (double cgpa, int age)
	{
		this.cgpa = cgpa;
		this.age = age;
	}

	public Employee()
	{
		System.out.println("Default");
	}

	public void display()
	{
		System.out.println(name+" "+cgpa+" "+age);
	} 
	
}
