class Main
{
	public static void main (String args[])
	{
		/* This will cause compiler error.
		Beacuse an instance of abstract class 
		can not be created*/
		//Base b = new Base();

		Base d = new Derived();
		
		d.fun();
	}
}