public class Bowler extends Player
{
	protected int wicketsTaken;
	
	public Bowler(){}
	public Bowler(String playerId, String playerName, double points, int wicketsTaken)
	{
		super(playerId, playerName, points);
		this.wicketsTaken = wicketsTaken;
	}
	
	public void setWicketsTaken(int wicketsTaken)
	{
		this.wicketsTaken = wicketsTaken;
	}
	int getWicketsTaken()
	{
		return this.wicketsTaken;
	}
	
	void showBowler()
	{
		System.out.println("Bowler Name: "+playerName);
		System.out.println("Bowler ID: "+playerId);
		System.out.println("Bowler Point: "+points);
		System.out.println("Bowler Wicket Taken: "+wicketsTaken);
	}
}