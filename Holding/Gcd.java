import javax.swing.JOptionPane;

 public class Gcd 
 {

    // main method begins execution of Java application
     public static void main( String args[] )
     {
        int a, b, integer1, integer2, remainder;
        String input;       // user input

        input = JOptionPane.showInputDialog(
             "Enter the first postive integer:" );
        integer1 = Integer.parseInt( input );

        input = JOptionPane.showInputDialog(
               "Enter the second postive integer:" );
        integer2 = Integer.parseInt( input );

        if (integer2 > integer1)
        {
      a = integer2;
      b = integer1;
     }
     else
     {
     a = integer1;
      b = integer2;
     }

     while ( b != 0)
     {
