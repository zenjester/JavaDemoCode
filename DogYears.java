import java.awt.*;
import javax.swing.*;

////////////////////////////////////////////////////////// class DogYears
class DogYears extends JFrame {

    //======================================= instance variables //Note 1
    private JTextField _humanYearsTF = new JTextField(3);        //Note 2
    private JTextField _dogYearsTF   = new JTextField(3);

    //======================================================== constructor
    public DogYears() {
        // 1... Create/initialize components
        JButton convertBtn = new JButton("Convert");             //Note 3

        // 2... Create content pane, set layout
        JPanel content = new JPanel();         // Create a content pane..
        content.setLayout(new FlowLayout());   // Use FlowLayout //Note 4

        // 3... Add the components to the content pane.
        content.add(new JLabel("Dog Years"));  // Create, add label //Note 5
        content.add(_dogYearsTF);              // Add input field
        content.add(convertBtn);               // Add button
        content.add(new JLabel("Human Years"));// Create, add label
        content.add(_humanYearsTF);            // Add output field

        // 4... Set this window's attributes.
        setContentPane(content);                                 //Note 6
        pack();                                                  //Note 7
        setTitle("Dog Year Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);            // Center window.
    }

    //======================================================== method main
    public static void main(String[] args) {                     //Note 8
        DogYears window = new DogYears();
        window.setVisible(true);
    }
}