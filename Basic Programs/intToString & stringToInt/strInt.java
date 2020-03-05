public class strInt
{
	public static void main(String args[])
	{
		int i = 5;
		String s = String.valueOf(i);
		System.out.println(s);
		
		String j = "6";
		int x = Integer.valueOf(j);
		x *= x;
		System.out.println(x);
	}
}