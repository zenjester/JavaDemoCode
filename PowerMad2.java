import javax.swing.*;

public class PowerMad2
{
	public static void main(String[] args)
	{
		PowerMad powerMad = new PowerMad();
		powerMad.powerUp();
	}
}

class PowerMad
{
	public void powerUp()
	{
		
		String inString = JOptionPane.showInputDialog(null, "Enter the number to be raised");
		String pwrString= JOptionPane.showInputDialog(null, "Enter power to be raised to");
		int value = Integer.parseInt(inString);
		int power = Integer.parseInt(pwrString);
		int outval;
		
		outval=value;
		
		for (int x=1;x<power;x++)
		{
			outval=outval*value;
		}
			
		JOptionPane.showMessageDialog(null, "The anser is " + outval);
	}
}

