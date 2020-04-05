abstract class Base
{
	final void fun()
	{
		System.out.println("Final method in Abstruct");
	}
}

class Derived extends Base {}

class Main
{
	public static void main (String args[])
	{
		Base b = new Derived();
		
		b.fun();
	}
}