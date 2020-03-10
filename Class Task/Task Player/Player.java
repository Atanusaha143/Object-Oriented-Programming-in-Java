public class Player
{
	protected String playerId;
	protected String playerName;
	protected double points;
	
	public Player(){}
	
	public Player(String playerId, String playerName, double points)
	{
		this.playerId = playerId;
		this.playerName = playerName;
		this.points = points;
	}
	
	public void setPlayerId(String playerId)
	{
		this.playerId = playerId;
	}
	public void setPlayerName(String playerName)
	{
		this.playerName = playerName;
	}
	public void setPoints(double points)
	{
		this.points = points;
	}
	
	String getPlayerId()
	{
		return this.playerId;
	}
	String getPlayerName()
	{
		return this.playerName;
	}
	double getPoints()
	{
		return this.points;
	}
	
	void addPoints(double points)
	{
		this.points += points;
	}
	void deductPoints(double points)
	{
		this.points -= points;
	}
}