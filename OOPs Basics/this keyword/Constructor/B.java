class B
{
	String name;
	int age;
	String occupation;
	
	B(String name, int age)
	{
		this.name = name;
		this.age = age; 
	}
	
	B(String name, int age, String occupation)
	{
		this(name,age);
		//this.name = name;
		//this.age = age;
		this.occupation = occupation;
	}
	
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Occupation: "+occupation);
	}
}