import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 public class Black extends JPanel {
    public int rb, cb;
  public void paintComponent(Graphics g) {
   super.paintComponent(g);
   g.setColor(Color.BLACK);
   g.fillOval(0, 0, getWidth(), getHeight());
   }
  }