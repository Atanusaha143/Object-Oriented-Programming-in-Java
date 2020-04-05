abstract class Base
{
	void fun()
	{
		System.out.println("Base Class's Fun Method");
	}
}

class Derived extends Base {}

class Main
{
	public static void main (String args[])
	{
		Derived d = new Derived();
		
		d.fun();
	}
}