import javax.swing.JApplet;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

//Since we're adding a Swing component, we now need to
//extend JApplet. We need to be careful to access
//components only on the event-dispatching thread.
public class ScrollingSimple extends JApplet {

    JTextField field;

    public void init() {
        //Execute a job on the event-dispatching thread:
        //creating this applet's GUI.
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    createGUI();
                }
            });
        } catch (Exception e) {
            System.err.println("createGUI didn't successfully complete");
        }

        addItem(false, "initializing... ");
    }

    private void createGUI() {        
        //Create the text field and make it uneditable.
        field = new JTextField();
        field.setEditable(false);

        //Set the layout manager so that the text field will be
        //as wide as possible.
        setLayout(new java.awt.GridLayout(1,0));

        //Add the text field to the applet.
        add(field);
    }

    public void start() {
        addItem(false, "starting... ");
    }

    public void stop() {
        addItem(false, "stopping... ");
    }

    public void destroy() {
        addItem(false, "preparing for unloading...");
        cleanUp();
    }
    
    private void cleanUp() {
        //Execute a job on the event-dispatching thread:
        //taking the text field out of this applet.
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    remove(field);
                }
            });
        } catch (Exception e) {
            System.err.println("cleanUp didn't successfully complete");
        }
        field = null;
    }

    private void addItem(boolean alreadyInEDT, String newWord) {
        if (alreadyInEDT) {
            addItem(newWord);
        } else {
            final String word = newWord;
            //Execute a job on the event-dispatching thread:
            //invoking addItem(newWord).
            try {
                SwingUtilities.invokeAndWait(new Runnable() {
                    public void run() {
                        addItem(word);
                    }
                });
            } catch (Exception e) {
                System.err.println("addItem didn't successfully complete");
            }
        }
    }
        
    //Invoke this method ONLY from the event-dispatching thread.
    private void addItem(String newWord) {
        String t = field.getText();
        System.out.println(newWord);
        field.setText(t + newWord);
    }
}
