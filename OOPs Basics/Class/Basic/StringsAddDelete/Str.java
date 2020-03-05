public class Str
{
	private String strg[];

	public Str()
	{
		strg = new String[5];
	}
	
	public void addMsg(int idx, String s)
	{
		strg[idx] = s;
	}

	public void deleteMsg(int idx)
	{
		strg[idx] = null;
	}
	
	public int getArraySize()
	{
		return strg.length;
	}


	public void preDisplay()
	{
		System.out.println("Strings you have entered: ");
		for(int i=0; i<strg.length; i++)
		{
			System.out.println("At index "+i+" String is "+strg[i]);
		}
	}

	public void nextDisplay()
	{
		for(int i=0; i<strg.length; i++)
		{
			System.out.println("At index "+i+" String is "+strg[i]);
		}
	}
}