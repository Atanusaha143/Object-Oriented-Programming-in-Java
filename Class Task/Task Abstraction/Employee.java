class Employee extends Person
{
	private String id;
	private int salary;
	
	public Employee(){}
	
	public void setID(String id)
	{
		this.id = id;
	}
	public String getID()
	{
		return id;
	}
	
	public void setSalary(int salary)
	{
		this.salary = salary;
	}	
	public int getSalary()
	{
		return salary;
	}
	
	public boolean hasOccupation()
	{
		occupation = true;
		
			return occupation;
	}
	
	public void display()
	{
		System.out.println("Name: "+getName());
		
			System.out.println("Age: "+getAge());
			
				System.out.println("Phone no.: "+getPhoneNo());
				
					System.out.println("Email: "+getEmail());
					
						System.out.println("ID: "+getID());
						
							System.out.println("Salary: "+getSalary());
							
		if(hasOccupation())
			
			System.out.println("Employee contains other Occupation");
		else
			
			System.out.println("Employee does not contain other Occupation");
	}
}