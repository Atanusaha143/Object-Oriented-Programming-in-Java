abstract class Person
{
	private String name;
	private int age;
	protected String phoneNo;
	protected String email;
	protected boolean occupation;
	
	public Person() {}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return age;
	}
	
	public void setPhoneNo(String phoneNo)
	{
		this.phoneNo = phoneNo;
	}
	public String getPhoneNo()
	{
		return phoneNo;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getEmail()
	{
		return email;
	}
	
	abstract boolean hasOccupation();
	
	abstract public void display();
}