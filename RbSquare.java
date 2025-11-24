import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 public class RbSquare {
  static int r, c;
public static class RSquare extends JPanel {
  public void paintComponent(Graphics g) {
   super.paintComponent(g);
   g.setColor(Color.GRAY);
   g.fillRect(0, 0, getWidth(), getHeight());
    g.setColor(Color.BLACK);
   }
  }
   public static class BSquare extends JPanel {
  public void paintComponent(Graphics g) {
   super.paintComponent(g);
   g.setColor(Color.CYAN);
   g.fillRect(0, 0, getWidth(), getHeight());
   }
  }
 static RbSquare[][] s;
 public static void main(String[] args) {
   JPanel c1= new JPanel();
    c1.setLayout(null);
   RSquare[][] R= new RSquare[8][8];
   BSquare[][] B= new BSquare[8][8]; 
  for(r=0; r<8; r++) {
   for(c=0; c<8; c++) {
    if(r%2==0) {
     if(c%2==0){
     R[r][c] = new RSquare();
      R[r][c].setBounds(20*c, 20*r, 20, 20);
      c1.add(R[r][c]);
     }
      else {
        B[r][c]= new BSquare();
      B[r][c].setBounds(20*c, 20*r, 20, 20);
      c1.add(B[r][c]);
      } 
    }
    else {
     if(c%2==0){
      B[r][c]= new BSquare();
      B[r][c].setBounds(20*c, 20*r, 20, 20);
      c1.add(B[r][c]);
      }
      else{
      R[r][c]= new RSquare();
      R[r][c].setBounds(20*c, 20*r, 20, 20);
      c1.add(R[r][c]);
     } 
    }
   }
  }
  JFrame w= new JFrame("red black squares");
   w.setContentPane(c1);
   w.setSize(500,500);
   w.setLocation(100, 100);
   w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   w.setVisible(true);
  }
}
 