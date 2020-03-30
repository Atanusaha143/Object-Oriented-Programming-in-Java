class Student extends Person
{
	private String id;
	private double cgpa;
	
	public Student(){};
	
	public void setID(String id)
	{
		this.id = id;
	}
	public void setCGPA(double cgpa)
	{
		this.cgpa = cgpa;
	}
	public String getID()
	{
		return id;
	}
	public double getCGPA()
	{
		return cgpa;
	}
	
	public boolean hasOccupation()
	{
		occupation = false;
		
			return occupation;
	}
	
	public void display()
	{
		System.out.println("Name: "+getName());
		
			System.out.println("Age: "+getAge());
			
				System.out.println("Phone no.: "+getPhoneNo());
				
					System.out.println("Email: "+getEmail());
					
						System.out.println("ID: "+getID());
						
							System.out.println("CGPA: "+getCGPA());
							
		if(hasOccupation())
			
			System.out.println("Student contains other Occupation");
		else
			
			System.out.println("Student does not contain other Occupation");
	}
}