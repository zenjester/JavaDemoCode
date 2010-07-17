import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextField extends JFrame
{
	private JTextField textField1;
	
	public TextField()
	{
		super("Testing JTextField"); // this is a constrictor call
		setLayout( new FlowLayout()); // set frame layout
		textField1 = new JTextField(10);// 10 column text field
		add(textField1); // add textField1 to JFrame
		
		//register event handler
		
		TextFieldHandler handler = new TextFieldHandler();
		textField1.addActionListener(handler);
	}
	
	//private inner class for event handling
	
	private class TextFieldHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			String string = ""; //display string 
			
			// user presses enter in textField1
			
			if (event.getSource() == textField1) //check if anything is happening in textField1
			string=String.format("textField1: %s",event.getActionCommand());//returns the frame name with what is entered
			
			JOptionPane.showMessageDialog(null,string);
		}
	}
}


			
