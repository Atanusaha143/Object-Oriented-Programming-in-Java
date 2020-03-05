public class Employee
{
	private String phnNo;
	private String email;

	void setPhnNo(String phnNo)
	{
		this.phnNo = phnNo;
	}
	String getPhnNo()
	{
		return this.phnNo;
	}

	void setEmail(String email)
	{
		this.email = email;
	}
	String getEmail()
	{
		return this.email;
	}

	void displayEmployee()
	{
		System.out.println("Phone Number: "+phnNo+"\nEmail: "+email);
	}

}