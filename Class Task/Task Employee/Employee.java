// Author: Atanu Saha
public class Employee
{
	public String name;
	public int id;
	public String gender;
	private int age;
	private String phnNo;
	public String designation;
	private static int totalNumOfEmployee;
	
	void setAge(int age)
	{
		this.age = age;
	}
	int getAge()
	{
		return this.age;
	}
	
	void setPhnNo(String phnNo)
	{
		this.phnNo = phnNo;
	}
	String getPhnNo()
	{
		return this.phnNo;
	}
	
	public Employee() // Default Constructor
	{ 	
		totalNumOfEmployee++;
	}
	
	public Employee(int x, String y) // Parameterized Constructor
	{
		age = x;
		phnNo = y;
	}
	
	public void display()
	{
		System.out.println("Employer Name: "+name+"\nEmplyoer ID: "+id+"\nEmplyoer Gender: "+gender);
		System.out.println("Employer Age: "+age+"\nEmplyoer Designation: "+designation);
		System.out.println("Phone Number of Employer: "+phnNo);
		System.out.println("Total Number of Employer: "+totalNumOfEmployee);
	}
	
}