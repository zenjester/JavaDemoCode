import javax.swing.JApplet;
import java.awt.Graphics;

public class HelloWorldApplet extends JApplet {
    public void paint(Graphics g) {
	g.drawRect(0, 0, 
		   getSize().width - 1,
		   getSize().height - 1);
        g.drawString("Hello world!", 5, 15);
    }
}
