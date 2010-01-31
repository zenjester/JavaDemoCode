import javax.swing.JOptionPane;

public class ScoreBoardTest5
// the gui version
{
	public static void main(String[] args)
	{
		//create variables to hold entered team names
		
		JOptionPane.showMessageDialog(null,"Welcome to Professor Parker's Score Predictor"); 
		//create a new ScoreBoard Object
		// note it uses the old ScoreBoard4 object
		
		ScoreBoard4 myScoreBoard = new ScoreBoard4("Sat 28th March 2010");
		
		//create a dialog box to enter the home team
		String homeTeam = JOptionPane.showInputDialog("Enter Home Team name");
		
		//create a dialog box to enter the home team
		String awayTeam = JOptionPane.showInputDialog("Enter Away Team name");
		
		//call setTeamNames method but use entered values
		myScoreBoard.setTeamNames(homeTeam,awayTeam);
	
		// call displayScore method
		
		JOptionPane.showMessageDialog(null,myScoreBoard.getScore(10,1));
		
		//call myScoreBoard's displayMessage Method
		myScoreBoard.displayMessage();
	}
}

