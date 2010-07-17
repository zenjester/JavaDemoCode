// Java core packages
import java.awt.*;

// Java extension packages
import javax.swing.JOptionPane;

public class Palindrome {

     // main method begins execution of Java application
     public static void main( String args[] ){

        String resultString;   // result String
        int number,             // user input number
            digit1,             // first digit
            digit2,             // second digit
            digit4,             // fourth digit
            digit5,             // fifth digit
            digits;             // number of digits in input

        number = Integer.parseInt(
               JOptionPane.showInputDialog(
               "Enter a 5-digit number: " ) );

           if ( number >= 100000 || number < 10000 ) {              JOptionPane.showMessageDialog( null,
                  "Number must be 5 digits", "Error",
                  JOptionPane.INFORMATION_MESSAGE );
    return;
   }
        
        digit1 = number / 10000;
        digit2 = number % 10000 / 1000;
        digit4 = number % 100 / 10;
digit5 = number % 10;

        if ( ( digit1 == digit5 ) && ( digit2 == digit4 ) )
            resultString = number + " is a palindrome!!!";

        else
            resultString =
               number + " is not a palindrome.";

        JOptionPane.showMessageDialog( null,
            resultString, "Palindrome Detector",
             JOptionPane.INFORMATION_MESSAGE );

     }  // end method main

}  // end class Palindrome

