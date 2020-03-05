public class Employee
{
	public String name;
	private int age;
	private String bloodGroup;
	
	public Employee()
	{
		name = "no name";
		age = 0;
		bloodGroup = null;
	}
	
	public Employee(String name, int age, String bloodGroup)
	{
		this.name = name;
		this.age = age;
		this.bloodGroup = bloodGroup;
	}
	
	/*void setAge(int age)
	{
		this.age = age; 
	}
	int getAge()
	{
		return this.age;
	}
	
	void setBloodGroup(String bloodGroup)
	{
		this.bloodGroup = bloodGroup; 
	}
	String getBloodGroup()
	{
		return this.bloodGroup;
	}*/
	
	void EmpDisplay()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Blood Group: "+bloodGroup);
	}
}