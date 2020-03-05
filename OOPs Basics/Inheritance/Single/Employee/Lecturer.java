public class Lecturer extends Employee
{
	private String dept;
	
	public Lecturer()
	{
		dept = null;
	}
	
	public Lecturer(String name, int age, String bloodGroup, String dept)
	{
		super(name,age,bloodGroup);
		this.dept = dept;
	}
	
	/*void setDept(String dept)
	{
		this.dept = dept;
	}
	String getDept()
	{
		return this.dept;
	}*/
	
	void display()
	{
		EmpDisplay();
		System.out.println("Dept: "+dept);
	}
}