// Java extension packages
import javax.swing.JOptionPane;

public class Triangle {

   // main method begins execution of program
   public static void main( String args[] )
   {
      int side1,        // length of side 1
          side2,        // length of side 2
          hypotenuse;   // length of hypotenuse
      String input,     // user input
             result;    // output String

      // read number from user as String
      input = JOptionPane.showInputDialog(
         "Enter length of side 1:" );

      side1 = Integer.parseInt( input );

      // read number from user as String
      input = JOptionPane.showInputDialog(
         "Enter length of side 2:" );

      side2 = Integer.parseInt( input );

      // read number from user as String
      input = JOptionPane.showInputDialog(
         "Enter length of hypotenuse:" );

      hypotenuse = Integer.parseInt( input );

      if ( ( side1 * side1 + side2 * side2 ) ==
         ( hypotenuse * hypotenuse ) )

         result = "These are the sides of a right triangle.";

      else
         result = "These do not form a right triangle.";

      JOptionPane.showMessageDialog( null, result, "Result",
         JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );

   }  // end method main

}  // end class Triangle

