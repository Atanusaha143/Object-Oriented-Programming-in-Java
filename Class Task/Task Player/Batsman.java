public class Batsman extends Player
{
	protected int runs;
	
	public Batsman(){}
	
	public Batsman(String playerId, String playerName, double points, int runs)
	{
		super(playerId, playerName, points);
		this.runs = runs;
	}
	public void setRuns(int runs)
	{
		this.runs = runs;
	}
	int getRuns()
	{
		return this.runs;
	}
	
	void showBatsman()
	{
		System.out.println("Batsman Name: "+playerName);
		System.out.println("Batsman ID: "+playerId);
		System.out.println("Batsman Point: "+points);
		System.out.println("Batsman Runs: "+runs);
	}
}