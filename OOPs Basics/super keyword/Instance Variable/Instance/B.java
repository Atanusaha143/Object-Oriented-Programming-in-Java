package Instance;

	public class B extends A
	{
		int x = 5;
		
		public void display()
		{
			System.out.println(super.x); // this will invokes this super class's instance
			System.out.println(x); // this will invokes this sub class's instance
		}
	}
