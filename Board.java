import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Board extends JPanel
                          implements FocusListener, MouseListener {
 public void paintComponent(Graphics g) {
  super.paintComponent(g);
 }
 public void focusGained(FocusEvent e) {
  repaint();
 }
 public void focusLost(FocusEvent e) {}
 public void mousePressed(MouseEvent e) {
  requestFocus();
 }
 public void mouseReleased(MouseEvent e) {}
 public void mouseClicked(MouseEvent e) {}
 public void mouseEntered(MouseEvent e) {}
 public void mouseExited(MouseEvent e) {}
 public Board() {
  addFocusListener(this);
  addMouseListener(this);
  setBackground(Color.RED);
 }
 public static void main(String[] args) {
  Board b= new Board();
  JFrame w= new JFrame("Test");
  JButton j= new JButton("ok");
   j.setBackground(Color.BLACK);
  j.addMouseListener(new MouseAdapter() {
   public void mousePressed(MouseEvent e) {
    j.requestFocus();
   }
  });
  j.addFocusListener(new FocusListener() {
   public void focusGained(FocusEvent e) {
    j.repaint();
   }
    public void focusLost(FocusEvent e) {}
   });
  b.setLayout(new BorderLayout());
  b.add(j, BorderLayout.SOUTH);
  w.setContentPane(b);
  w.setSize(100, 100);
  w.setLocation(100, 100);
  w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  w.setVisible(true);
 }
}
 