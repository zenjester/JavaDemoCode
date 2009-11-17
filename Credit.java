// Java core packages
import java.awt.*;

// Java extension packages
import javax.swing.JOptionPane;

public class Credit {

   // main method begins execution of Java application
   public static void main( String args[] )
   {
      String inputString,          // user input
             resultsString,        // result String
             creditStatusString;     // credit status
      int account,                 // account number
          oldBalance,                // starting balance
          charges,                 // total charges
          credits,                 // total credits
          creditLimit,             // allowed credit limit
          newBalance;              // new balance

      inputString = JOptionPane.showInputDialog(
         "Enter account number: " );

      /* write code to convert the input string to an integer
         and store it in account */
      
      account = Integer.parseInt( inputString );

      /* write code to input the rest of the customer information
         and convert the inputs to integers.
         Use inputString to input each value. */
      
      //resuse inputString to enter old balance?
      
      inputString = JOptionPane.showInputDialog( "Enter Balance: " );
      oldBalance = Integer.parseInt( inputString );
       
      //enter charges
      
       inputString = JOptionPane.showInputDialog("Enter Charges: " );
       charges = Integer.parseInt( inputString );
      
      // enter credits
       
        inputString = JOptionPane.showInputDialog(
         "Enter Credits: " );
        credits = Integer.parseInt( inputString );
        
      // Enter credit limit
        
         inputString = JOptionPane.showInputDialog(
         "Enter Credit Limit: " );
         creditLimit = Integer.parseInt( inputString );
        
        
      
      /* write code to compute the new balance */
         newBalance = oldBalance - credits + charges;

      /* write the code that will check if the new balance is 
         greater than the credit limit, and set the proper value 
         for creditStatusString */

  resultsString = "New balance is " + newBalance;
  
  //temp credit status string
  
    
  creditStatusString= "Good Credit Rating Cool ";
  
  if (newBalance > creditLimit) {
    creditStatusString = "Appalling Credit Rating";
  }
  else
  {
    creditStatusString= "Good Credit Rating Cool ";
  }
    

      JOptionPane.showMessageDialog( null, resultsString,
         creditStatusString, JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );
   }  // end method main
}  // end class Credit
