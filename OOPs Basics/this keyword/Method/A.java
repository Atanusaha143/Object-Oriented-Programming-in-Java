class A
{
	int i;
	void display()
	{
		System.out.println("Display Method");
		System.out.println("Value of I: "+i);
	}
	
	void show()
	{
		this.i = 7;
		this.display();
		System.out.println("Show Method");
	}
}