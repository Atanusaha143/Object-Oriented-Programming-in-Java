public class Employee
{
	private String name;
	private int age;
	private String id;
	private String email;
	private String designation;
	private Address address;
	
	public Employee(String name, int age, String id, String email, String designation, Address address)
	{
		this.name = name;
		this.age = age;
		this.id = id;
		this.email = email;
		this.designation = designation;
		this.address = address;
	}
	
	void display()
	{
		//System.out.println();
		System.out.println("\nName: "+name);
		System.out.println("Age: "+age);
		System.out.println("ID: "+id);
		System.out.println("Email: "+email);
		System.out.println("Designation: "+designation);
		System.out.println("Address: ");
		System.out.println("	House No. : "+address.houseNo);
		System.out.println("	Road No. : "+address.roadNo);
		System.out.println("	House Name. : "+address.houseName);
	}
}