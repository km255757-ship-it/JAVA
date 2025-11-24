import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JoinSquares extends JPanel {
 static Mouse1 mj;
 static JoinSquares j;
 static Red R, R1;
 static Blue B, B1;
 static boolean b= true;
public static class Red extends JPanel {
 public void paintComponent(Graphics g) {
  super.paintComponent(g);
   g.setColor(Color.RED);
   g.fillRect(0, 0, getWidth()-1, getHeight()-1);
 }
}
public static class Blue extends JPanel {
 public void paintComponent(Graphics g) {
  super.paintComponent(g);
   g.setColor(Color.BLUE);
   g.fillRect(0, 0, getWidth(), getHeight());
 }
}
 public static class Mouse implements MouseListener {
  public void mousePressed(MouseEvent e) {
   Component s=(Component)e.getSource();
    if(s== R){
     System.out.print(e.getX());
      j.remove(R);
       j.repaint();
     }
    if(s== B){
    B.setBounds(0, 0, 20, 20);
    j.add(B1);
    B1.setBounds(20, 20, 20, 20);
    }
   }
   public void mouseClicked(MouseEvent e) {}
 public void mouseEntered(MouseEvent e) {}
 public void mouseReleased(MouseEvent e) {}
 public void mouseExited(MouseEvent e) {}
  }
  public static class Mouse1 implements MouseListener {
  public void mousePressed(MouseEvent e) {
   Component s=(Component)e.getSource();
    if(s== j){
     System.out.print(e.getX());
     }
   }
   public void mouseClicked(MouseEvent e) {}
 public void mouseEntered(MouseEvent e) {}
 public void mouseReleased(MouseEvent e) {}
 public void mouseExited(MouseEvent e) {}
  }
 public static void main(String[] args) {
   B1= new Blue();
   R = new Red();
   B= new Blue();
  Mouse m= new Mouse();
        mj= new Mouse1();
   R.addMouseListener(m);
  j= new JoinSquares();
  j.addMouseListener(mj);
  j.setLayout(null);
   j.add(B);
    j.add(R);
   B.setBounds(0, 0, 20, 20);
  R.setBounds(20, 20, 20, 20);
  JFrame w= new JFrame("BOARD");
    w.setContentPane(j);
    w.setSize(175, 195);
    w.setLocation(100, 100);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    w.setVisible(true);
  }
}