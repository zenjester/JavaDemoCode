// package bob;

import javax.swing.JOptionPane;  //  import class JOptionPane

class tank
{
	String TankName;
	int TankNumber;
}

public class TestTank {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tank t1 = new tank();
		tank t2 = new tank();
		
		t1.TankName="bob";
		t1.TankNumber= 2;
		
		JOptionPane.showMessageDialog( null, "My name is " +  t1.TankName );
		JOptionPane.showMessageDialog( null, "My number is " + t1.TankNumber );//System.out.println("my name is " + t1.TankName);
		//System.out.println("My number is " + t1.TankNumber);
		}

}
