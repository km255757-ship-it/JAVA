import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ChessBoard {
 static int r, c;
 static RSquare[][] R= new RSquare[8][8]; 
 static BSquare[][] B= new BSquare[8][8]; ;
 static Empty[][] E= new Empty[8][8]; ;
 static DrawBoard b;
 static  Bmouse bm;
 static  int count, r1, c1;
 static boolean firstDraw;
public static class Empty extends JPanel {
 public void paintComponent(Graphics g) {
  super.paintComponent(g);
   g.setColor(Color.GRAY);
   g.fillRect(0, 0, getWidth(), getHeight());
 }
}
 public static class Bmouse implements MouseListener {
  public void mousePressed(MouseEvent e){
   Component s= (Component)e.getSource();
    r= e.getY()/20;
    c= e.getX()/20;
    if(s== B[r][c]){
     firstDraw= true;
     r1=r;
      c1=c;
      B[r][c].repaint();
     }
     else if(s== E[r][c]) {
        E[r][c].setBounds(20*c1, 20*r1, 20, 20);
        E[r][c].repaint();
        B[r1][c1].setBounds(20*c, 20*r, 20, 20);
         B[r1][c1].repaint();
       }
     }
     public void mouseClicked(MouseEvent e) {}
 public void mouseEntered(MouseEvent e) {}
 public void mouseReleased(MouseEvent e) {}
 public void mouseExited(MouseEvent e) {}
    }
 public static void main(String[] args) {
    bm= new Bmouse();
    b= new DrawBoard();
    b.setLayout(null);
   JFrame w= new JFrame("BOARD");
    w.setContentPane(b);
    w.setSize(175, 195);
    w.setLocation(100, 100);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    w.setVisible(true);
  }
  public static class BSquare extends JPanel {
  public void paintComponent(Graphics g) {
   super.paintComponent(g);
   g.setColor(Color.BLACK);
   g.fillOval(0, 0, getWidth(), getHeight());
   }
  }
  public static class RSquare extends JPanel {
  public void paintComponent(Graphics g) {
   super.paintComponent(g);
   g.setColor(Color.RED);
   g.fillOval(0, 0, getWidth(), getHeight());
   }
  }
 public static class DrawBoard extends JPanel {
   Color[][] grid= new Color[8][8];
   public DrawBoard() {
     for(int r=0; r<8; r++) {
      for(int c=0; c<8; c++) {
       if(r%2== 0) {
        if(c%2== 0)
         grid[r][c]= Color.GRAY;
        else
         grid[r][c]= Color.CYAN;
       }
       else {
        if(c%2== 0)
         grid[r][c]= Color.CYAN;
         else
          grid[r][c]= Color.GRAY;
       }
      }
     }
      for(r=0; r<8; r++) {
   for(c=0; c<8; c++) {
     B[r][c]= new BSquare();
     B[r][c].addMouseListener(bm);
     R[r][c]= new RSquare();
     E[r][c]= new Empty();
     E[r][c].addMouseListener(bm);
      this.add(B[r][c]);
     this.add(R[r][c]);
      this.add(E[r][c]);
    if(r<3 || firstDraw==true) {
    if(r%2==0 && c%2==0){
      B[r][c].setBounds(20*c, 20*r, 20, 20);
     }
     if(r%2 !=0 && c%2 !=0) {
      B[r][c].setBounds(20*c, 20*r, 20, 20);
     }
     }
      if(r>=5) {
       if(r%2 !=0 && c%2 !=0){
        R[r][c].setBounds(20*c, 20*r, 20, 20);
        }
        if(r%2==0 && c%2==0){
      R[r][c].setBounds(20*c, 20*r, 20, 20);
     }
     }
      if(r==3 && r== 4 ) {
       if(r%2 !=0 && c%2 !=0){
        E[r][c].setBounds(20*c, 20*r, 20, 20);
       }
       if(r%2==0 && r==0) {
        E[r][c].setBounds(20*c, 20*r, 20, 20);
       }
     }
    }
    }
    } 
  public void paintComponent(Graphics g) {
   super.paintComponent(g);
     for(int r=0; r<8; r++) {
      for(int c=0; c<8; c++) {
   g.setColor(grid[r][c]);
   g.fillRect(r*20, c*20, 20, 20);
   }
  }
 }
 }
}