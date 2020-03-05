public class Student
{
	private String name;
	private int id;
	private double cgpa;
	private int marks[];

	public Student()
	{
		name = "NO NAME";
		id = 0;
		cgpa = 0.0;
		marks = new int[5];
	}

	public void setName(String nam)
	{
		name = nam;
	}
	public String getName()
	{
		return name;
	}


	public void setId(int iid)
	{
		id = iid;
	}
	public int getId()
	{
		return id;
	}

	public void setCgpa(double cg)
	{
		cgpa = cg;
	}
	public double getCgpa()
	{
		return cgpa;
	}


	public void setMarks(int idx, int mark)
	{
			marks[idx] = mark;
	}
	public void setMarks(int mark)
	{
		for(int i=0; i<marks.length; i++)
		{
			if(marks[i]==0)
			{
				marks[i] = mark;
				break;
			}
		}
	}
	public int getArraySize()
	{
		return marks.length;
	}


	public void display()
	{
		System.out.println("Name: "+name+"\nId: "+id+"\nCGPA: "+cgpa);
		System.out.println("Marks: ");
		for(int i=0; i<marks.length; i++)
		{
			System.out.println("At index "+i+" mark is "+marks[i]);
		}
	}
}