public class ScoreBoard3
{
	// these variables can be accessesd by any method in the class
	
	String firstTeam, secondTeam;
	
	public void displayMessage()
	{
		System.out.println("Welcome to the Scoreboard version 3!");
	}
	
	public String getScore (int first, int second)
	{
		String scoreMsg = "Final Score "+ firstTeam + " "+ first + " " + secondTeam +" " + second;
		return(scoreMsg);
	}
	
	public void setTeamNames (String team1, String team2)
	{
		// set entered values to class accesible variables
		firstTeam=team1;
		secondTeam=team2;
	}
}
