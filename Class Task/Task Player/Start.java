import java.util.Scanner;

public class Start
{
	public static void main (String args[])
	{
		Batsman bats = new Batsman();
		Bowler bowl = new Bowler();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Choose an option from below:");
		System.out.println("Enter 1 for Batsman.");
		System.out.println("Enter 2 for Bowler.");
		System.out.print("Enter option: ");
		int n = input.nextInt();
		
		if(n==1)
		{
			String escape = input.nextLine();
			
			System.out.print("Enter Batsman ID: ");
			String id = input.nextLine();
			bats.setPlayerId(id);
			
			System.out.print("Enter Batsman Name: ");
			String name = input.nextLine();
			bats.setPlayerName(name);
			
			System.out.print("Enter Batsman Points: ");
			double pts = input.nextDouble();
			bats.setPoints(pts);
			
			System.out.print("Enter Batsman Runs: ");
			int run = input.nextInt();
			bats.setRuns(run);
			
			System.out.print("Enter Points To Be Added: ");
			double addpts = input.nextDouble();
			bats.addPoints(addpts);
			
			System.out.print("Enter Points To Be Deducted: ");
			double ddpts = input.nextDouble();
			bats.deductPoints(ddpts);
			
			System.out.println("Batsman ID: "+bats.getPlayerId());
			System.out.println("Batsman Name: "+bats.getPlayerName());
			System.out.println("Batsman Points: "+bats.getPoints());
			System.out.println("Batsman Runs: "+bats.getRuns());
			
			//bats.showBatsman();
		}
		else
		{
			String escape = input.nextLine();
			
			System.out.print("Enter Bowler ID: ");
			String id = input.nextLine();
			bowl.setPlayerId(id);
			
			System.out.print("Enter Bowler Name: ");
			String name = input.nextLine();
			bowl.setPlayerName(name);
			
			System.out.print("Enter Bowler Points: ");
			double pts = input.nextDouble();
			bowl.setPoints(pts);
			
			System.out.print("Enter Bowler Wickets Taken: ");
			int wicktake = input.nextInt();
			bowl.setWicketsTaken(wicktake);
			
			System.out.print("Enter Points To Be Added: ");
			double addpts = input.nextDouble();
			bowl.addPoints(addpts);
			
			System.out.print("Enter Points To Be Deducted: ");
			double ddpts = input.nextDouble();
			bowl.deductPoints(ddpts);
			
			System.out.println("Bowler ID: "+bowl.getPlayerId());
			System.out.println("Bowler Name: "+bowl.getPlayerName());
			System.out.println("Bowler Points: "+bowl.getPoints());
			System.out.println("Bowler Wicket Taken: "+bowl.getWicketsTaken());
			
			
			//bowl.showBowler();
		}
		
	}
}