import javax.swing.*;
import java.awt.*; 
//import java.awt.font;

public class Text1 {
	
	public static void main (String[] args) {
		Text1  gui = new Text1();
		gui.go();
	}
	
	public void go() {
			
		JFrame frame = new JFrame();
		JTextField field = new JTextField(20);
		JTextField field2 = new JTextField("Hello");
		JTextArea status = new JTextArea(4,20);
		status.setLineWrap(true);
		status.setWrapStyleWord(true);
		//status.setSelectedTextColor("CYAN");
		field.setText("Dude whatever");
		field.setFont(new Font( "Serif", Font.PLAIN, 20 ) );
		status.setText("This is not good or is it the end welln nigh impossible");
		status.setFont(new Font( "Serif", Font.BOLD, 20 ) );
		frame.getContentPane().add(BorderLayout.EAST, field2);
		frame.getContentPane().add(BorderLayout.NORTH, field);
		frame.getContentPane().add(BorderLayout.CENTER, status);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
}
