class Emp
{
	String name;
	int age;
	static String color;
	
	Emp()
	{
		this.name = name;
		this.age = age;
	}
	
	void show()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Color: "+color);
	}
}

class Employee
{
	public static void main (String args[])
	{
		Emp p1 = new Emp();
		Emp p2 = new Emp();
		
		p1.name = "Atanu";
		p1.age = 21;
		
		p2.name = "Saha";
		p2.age = 22;
		
		Emp.color = "Whight";

		p1.show();
		p2.show();
	}
}