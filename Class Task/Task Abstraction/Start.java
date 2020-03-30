import java.util.Scanner;

class Start
{
	public static void main(String args[])
	{
		Scanner cin = new Scanner(System.in);
		
		Person p1;
		Student s = new Student();
		
		System.out.print("Enter Student Name: ");
			String name = cin.next();
				s.setName(name);
				
		System.out.print("Enter Student Age: ");
			int age = cin.nextInt();
				s.setAge(age);
				
		System.out.print("Enter Phone Number: ");
			String phn = cin.next();
				s.setPhoneNo(phn);
				
		System.out.print("Enter Student Email: ");
			String email = cin.next();
				s.setEmail(email);
		
		System.out.print("Enter Student ID: ");
			String id = cin.next();
				s.setID(id);
		
		System.out.print("Enter Student CGPA: ");
			double cg = cin.nextDouble();
				s.setCGPA(cg);
				
		
		p1 = s;
		p1.hasOccupation();
		p1.display();
		
		Employee emp = new Employee();
		
		System.out.print("\nEnter Employee Name: ");
			String ename = cin.next();
				emp.setName(ename);
				
		System.out.print("Enter Employee Age: ");
			int eage = cin.nextInt();
				emp.setAge(eage);
					
		System.out.print("Enter Employee Phone No. : ");
			String ephn = cin.next();
				emp.setPhoneNo(ephn);
				
		System.out.print("Enter Employee Email: ");
			String eemail = cin.next();
				emp.setEmail(eemail);
		
		System.out.print("Enter Employee ID: ");
			String eid = cin.next();
				emp.setID(eid);
		
		System.out.print("Enter Employee Salary: ");
			int sal = cin.nextInt();
				emp.setSalary(sal);
				
				
		p1 = emp;		
		p1.hasOccupation();
		p1.display();
	}
}