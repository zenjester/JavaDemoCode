import java.awt.*;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.*;

public class CheckBoxFrame extends JFrame
{
	private JTextField textField;
	private JCheckBox bold;
	private JCheckBox italic;
	
	public CheckBoxFrame()
	{
		super("JCheckbox Test");
		setLayout(new FlowLayout());
		
		textField = new JTextField("Change the font", 20);
		textField.setFont(new Font("Serif",Font.PLAIN,14));
		add(textField);
		
		bold = new JCheckBox("Bold"); //check box with button name
		italic= new JCheckBox("Italic");
		
		add(bold); //add checkboxes to frame
		add(italic);
		
		CheckBoxHandler handler = new CheckBoxHandler();
		bold.addItemListener(handler); //add an event handler to see if the button has been pressed
		italic.addItemListener(handler);
		
	}
	private class CheckBoxHandler implements ItemListener
	{
		public void itemStateChanged(ItemEvent event) //method to check for boxes being selected
		{
			Font font = null; //storage for new font
			
			if (bold.isSelected() && italic.isSelected())
				font = new Font("Serif",Font.BOLD + Font.ITALIC,14);
			else if (bold.isSelected())
				font = new Font("Serif",Font.BOLD,14);
			else if (italic.isSelected())
				font = new Font("Serif",Font.ITALIC,14);
			else
				font = new Font("Serif",Font.PLAIN,14);
			
			textField.setFont(font);// set the font of textField
		}
	}
}
		
