class A
{
	String name;
	int age;
	int occupation;
	
	A(String name, int age)
	{
		this.name = name;
		this.age = age; 
	}
	
	A(String name, int age, int occupation)
	{
		this.name = name;
		this.age = age;
		this.occupation = occupation;
	}
	
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Name: "+age);
		System.out.println("Name: "+occupation);
	}
}