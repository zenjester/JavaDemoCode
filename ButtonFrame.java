import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonFrame extends JFrame
{
	private JButton plain;
	private JButton fancy;
	
	public ButtonFrame()
	{
		super("Testing Buttons");
		setLayout(new FlowLayout());
		plain = new JButton("Plain Button"); // button with text
		add (plain); // add button plain to frame
		
		Icon monkey = new ImageIcon(getClass().getResource("face-monkey.png")); //image
		Icon exitsys = new ImageIcon(getClass().getResource("system-log-out.png"));//rollover image
		
		fancy = new JButton ("Fancy Button", monkey);
		fancy.setRolloverIcon(exitsys);
		add(fancy);
		
		//button handler
		
		ButtonHandler handler = new ButtonHandler();
		fancy.addActionListener(handler);
		plain.addActionListener(handler);
		
	}
	
	//inner class for event handling
	private class ButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			JOptionPane.showMessageDialog(ButtonFrame.this,String.format("You pressed: %", event.getActionCommand()));
		}
	}
}

		
		
		
