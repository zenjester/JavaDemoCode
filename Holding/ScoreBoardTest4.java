public class ScoreBoardTest4
// the constructor version
{
	public static void main(String[] args)
	{
		//create a new ScoreBoard Object
		
		ScoreBoard4 myScoreBoard = new ScoreBoard4("Sat 19th March 2010");
		//call setTeamNames method
			
		myScoreBoard.setTeamNames("Burnley", "Bolton");
	
		// call displayScore method
		
		System.out.println(myScoreBoard.getScore(10,1));
		
		//call myScoreBoard's displayMessage Method
		myScoreBoard.displayMessage();
	}
}

