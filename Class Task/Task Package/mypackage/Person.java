package mypackage;

public class Person
{
		public String name;
		private int age;
		public String bloodGroup;
		
		public void setName(String name)
		{
			this.name = name;
		}
		public String getName()
		{
			return this.name;
		}
		
		public void setAge(int age)
		{
			this.age = age;
		}
		public int getAge()
		{
			return this.age;
		}
		public Person()
		{
		}
		
		public Person(int age)
		{
			this.age = age;
		}
		
		public void setBloodGroup(String bloodGroup)
		{
			this.bloodGroup = bloodGroup;
		}
		public String getBloodGroup()
		{
			return this.bloodGroup;
		}
		
		public void display()
		{
			System.out.println("Name: "+name+"\nAge: "+age+"\nBlood Group: "+bloodGroup);
		}
} 