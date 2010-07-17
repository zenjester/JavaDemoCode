import java.awt.*;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.*;

public class ComboBoxFrame extends JFrame
{
	private JComboBox imagesJComboBox;
	private JLabel label;
	
	private static final String[] names = {"Add.png","Save.png","Info.png","Comment.png" };
	private Icon[] icons = {
		new ImageIcon( getClass().getResource(names[0])),
		new ImageIcon( getClass().getResource(names[1])),
		new ImageIcon( getClass().getResource(names[2])),
		new ImageIcon( getClass().getResource(names[3])) };
		
		public ComboBoxFrame()
		{
			super("Testing JComboBox");
			setLayout(new FlowLayout());
			imagesJComboBox = new JComboBox(names);// set up JComboBox
			imagesJComboBox.setMaximumRowCount(3);// display three rows
			
			imagesJComboBox.addItemListener ( // ( not { this is an inner class
				new ItemListener()
				{
					public void itemStateChanged(ItemEvent event)
					{
											if (event.getStateChange() == ItemEvent.SELECTED)
							label.setIcon(icons[imagesJComboBox.getSelectedIndex()]);
				}
			}
		);
					add(imagesJComboBox);
					label = new JLabel(icons[0]);
					add(label);
		}
	}
