public class ScoreBoard4
{
	// these variables can be accessesd by any method in the class
	
	String firstTeam, secondTeam;
	
	private String boardName;
	
	//start constructor
	
	public ScoreBoard4(String name)
	{
		boardName=name;
	}
	
	//end constructor code
	
	public void displayMessage()
	{
		System.out.println("Welcome to the " + boardName + " Scoreboard version 4!");
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
