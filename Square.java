import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 public class Square  {
 static BlueSquare b;
 static  RedSquare r;
 static int x, y, x1=5, y1=5, w1=30, h1=30, w=30, h=30;
 static Component source;
  static boolean t= true;
  static boolean dragging;
 public static class BlueSquare extends JPanel {
  public void paintComponent(Graphics g) {
   super.paintComponent(g);
   g.setColor(Color.BLUE);
   g.fillRect(0, 0, getWidth(), getHeight());
  }
 }
  public static class RedSquare extends JPanel {
  public void paintComponent(Graphics g) {
   super.paintComponent(g);
   g.setColor(Color.RED);
   g.fillRect(0, 0, getWidth(), getHeight());
  }
 }
 public static void main(String[] args) {
  JPanel content= new JPanel();
   content.setLayout(null);
   b= new BlueSquare();
   r= new RedSquare();
    content.add(b);
    content.add(r);
   if(t==true){
   b.setBounds(x, y, w, h);
   r.setBounds(x1, y1, w1, h1);
  }
   t= false;
    SquareListener L= new SquareListener();
   b.addMouseListener(L);
   r.addMouseListener(L);
   b.addMouseMotionListener(L);
   r.addMouseMotionListener(L);
   JFrame w= new JFrame("SQUARES");
   w.setContentPane(content);
   w.setSize(300,300);
   w.setLocation(100, 100);
   w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   w.setVisible(true);
  }
 public static class SquareListener implements MouseListener, MouseMotionListener {
  public void mousePressed(MouseEvent e) {
 dragging= true;
   source= (Component) e.getSource();
    if(source== b) {
     x= e.getX();
     y= e.getY();
     b.repaint();
    }
     else {
     x1= e.getX();
     y1= e.getY();
     r.repaint();
     }
 }
   
   public void mouseDragged(MouseEvent e1) {
   if(dragging== false)
    dragging= false;
   else {
    if(source== b){
     x= e1.getX();
     y= e1.getY();
     b.setBounds(x, y, w, h);
     b.repaint();
    }
     else{
     x1= e1.getX();
     y1= e1.getY();
     r.setBounds(x1, y1, w1, h1);
     r.repaint();
     }
    }    }
    public void mouseClicked(MouseEvent e) {}
 public void mouseMoved(MouseEvent e) {}
 public void mouseEntered(MouseEvent e) {}
 public void mouseReleased(MouseEvent e) {}
 public void mouseExited(MouseEvent e) {}
}
}
     
    
   