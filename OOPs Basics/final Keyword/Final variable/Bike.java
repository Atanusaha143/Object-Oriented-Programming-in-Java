class JoBike
{
	final void run()
	{
		System.out.println("Running...");
	}
}

class Honda extends JoBike {}

class Bike
{
	public static void main(String args[])
	{
		/*JoBike JB = new JoBike();
		JB.run();*/           
		
		new JoBike().run();
	}
}

