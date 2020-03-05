public class MainEmplyoee
{
	public static void main(String args[])
	{
		Employee em = new Employee();
		em.name = "ABC";
		em.id = 123;
		em.gender = "Male";
		em.designation = "CEO";
		em.setAge(21);
		em.setPhnNo("017111111");
		
		em.display();
	}
}