public class Confidential
{
	private int registrationNo;
	private int engineNo;
	private int plateNo;
	
	public Confidential(){}
	
	public Confidential(int registrationNo, int engineNo, int plateNo)
	{
		this.registrationNo = registrationNo;
		this.engineNo = engineNo;
		this.plateNo = plateNo;
	}
	
	public int getRegistrationNo()
	{
		return this.registrationNo;
	}
	
	public int getEngineNo()
	{
		return this.engineNo;
	}
	
	public int getPlateNo()
	{
		return this.plateNo;
	}
}