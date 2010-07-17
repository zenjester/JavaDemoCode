package bob;

import javax.swing.*;

public class ComputeSalary  {
   static final double HOURLY_RATE = 30.5;
   public static void main( String args[] ) {
      String hoursStr;   // hours string
      int hours;         // basic working hour
      double salary;     // salary

      // read in hours from user as a string and convert to type int
      hoursStr =
         JOptionPane.showInputDialog( "Enter no. of working hour" );
      hours = Integer.parseInt( hoursStr );

      // compute basic salary
      salary = hours*HOURLY_RATE;

      // add overtime pay
      if (hours > 40)
      	   salary = salary + (hours-40)*HOURLY_RATE*0.5;

      JOptionPane.showMessageDialog(null, "The salary is " + salary,
		"Results", JOptionPane.PLAIN_MESSAGE );

      System.exit( 0 );   // terminate application
   }
}

