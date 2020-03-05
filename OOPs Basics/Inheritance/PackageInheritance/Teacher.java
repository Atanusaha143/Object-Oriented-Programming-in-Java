package PackageInheritance;

public class Teacher extends Person
{
	public String information;
	
	public void displayInformation2()
	{
		displayInformation1();
		System.out.println("Information: "+information);
	}
}