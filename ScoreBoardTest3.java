public class ScoreBoardTest3
{
	public static void main(String[] args)
	{
		//create a new ScoreBoard Object
		
		ScoreBoard3 myScoreBoard = new ScoreBoard3();
		//call setTeamNames method
			
		myScoreBoard.setTeamNames("Burnley", "Bolton");
	
		// call displayScore method
		
		System.out.println(myScoreBoard.getScore(10,1));
		
		//call myScoreBoard's displayMessage Method
		myScoreBoard.displayMessage();
	}
}

