public class Student
{
	private String name;
	private int age;
	private String mail;
	
	public Student()
	{
		name = "no name";
		age = 0;
		mail = null;
	}
	
	public Student(String name, int age, String mail)
	{
		this.name = name;
		this.age = age;
		this.mail = mail;
	}

	void setNameAgeMail(String name, int age, String mail)
	{
		this.name = name;
		this.age = age;
		this.mail = mail;
	}
	
	/*int getNameAgeMail()
	{
		return name;
		return age;
		return mail;
	}*/
	
	void display()
	{
		System.out.println("Name: "+name+"\nAge: "+age+"\nMail: "+mail);
	}
}