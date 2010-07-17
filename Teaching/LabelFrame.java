//JLabel class demo
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

public class LabelFrame extends JFrame
{
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	
	public LabelFrame()
	{
		super("Testing JLabel");
		setLayout(new FlowLayout());
		
		label1= new JLabel("Label with text");
		label1.setToolTipText("This is label1");
		add (label1);
		
		Icon smile = new ImageIcon(getClass().getResource("face-monkey.png"));
		label2=new JLabel("Label with text and Icon", smile, SwingConstants.LEFT);
		add(label2);
		
		label3 = new JLabel();
		label3.setText("Label with icon and text at bottom");
		label3.setIcon(smile);
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.BOTTOM);
		label3.setToolTipText("This is label3");
		add(label3);
	}
}
		
