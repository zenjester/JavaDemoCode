 // An addition program.
  
// Java extension packages
import javax.swing.JOptionPane;  // import class JOptionPane
 
 public class Addition {
 
    // main method begins execution of Java application
    public static void main( String args[] )
    {
   String firstNumber;   // first string entered by user
       String secondNumber;  // second string entered by user
       int number1;          // first number to add
       int number2;          // second number to add
       int sum;              // sum of number1 and number2
 
       // read in first number from user as a String
       firstNumber =
          JOptionPane.showInputDialog( "Enter first integer" );
 
       // read in second number from user as a String
       secondNumber =
         JOptionPane.showInputDialog( "Enter second integer" );
 
       // convert numbers from type String to type int
       number1 = Integer.parseInt( firstNumber ); 
       number2 = Integer.parseInt( secondNumber );
 
       // add the numbers
       sum = number1 + number2;
       // display the results
       JOptionPane.showMessageDialog( null, "The sum is " + sum, "Results",  JOptionPane.PLAIN_MESSAGE );
 
       System.exit( 0 );   // terminate application

    }  // end method main
 
 }  // end class Addition
