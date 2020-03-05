class Emp
{
	public String name;
	public int age;
	public int id;
	
	Emp(String name, int age, int id)
	{
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	void show()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("ID: "+id);
	}
}