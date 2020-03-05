public class Student
{
	public String name;
	private double cgpa;
	public Student(double cgpa)
	{
		this.cgpa = cgpa;
	}
	/*public Student()
	{
		
	}*/
	public void display()
	{
		System.out.println("Name: " + name+ " CGPA: " +cgpa);
	}
}