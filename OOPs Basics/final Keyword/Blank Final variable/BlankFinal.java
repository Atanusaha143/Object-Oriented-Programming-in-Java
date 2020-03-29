public class BlankFinal
{
	final String UNIVERSITY_NAME; // Blank Final Variable
	final int FEES; // Blank Final Variable

	BlankFinal(String UNIVERSITY_NAME, int FEES)
	{
		this.UNIVERSITY_NAME = UNIVERSITY_NAME;
		this.FEES = FEES;
	}

	void display()
	{
		System.out.println("Name: "+UNIVERSITY_NAME);
		System.out.println("Fees: "+FEES);
	}
}