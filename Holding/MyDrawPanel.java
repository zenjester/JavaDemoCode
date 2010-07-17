class MyDrawPanel extends JPanel implements ControllerEventListener
     // only if we got an event do we want to paint
     boolean mag = false;
     public void controlChange(ShortMessage event) {
        msg = true;
        repaint 0 ;
     public Dimension getPreferredSize()
       return new Dimension(300,300);
     public void paintComponent(Graphics g) {
        if (msg) {
          Graphics2D g2 = (Graphics2D) g;
          int r = (int) (Math.random() * 250);
          int gr = (int) (Math.random() * 250);
          int b = (int) (Math.random() * 250);
          g.setColor(new Color(r,gr,b);
          int ht = (int) (Math.random() * 120) + 10);
          int width = (int) (Math.random() * 120) + 10);
                  = (int) (Math.randomO * 40) + 10);
          int x
                  = (int)  (Math.random() * 40) + 10);
          int y
          g .fillRect(x,y,ht, width);
          mag = false;
      } // close i f
    } // close method
   } //close inner class
 //close class
