import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ML implements MouseListener {
 public void mousePressed(MouseEvent e) {
   int r= (e.getY())/20;
   int c= (e.getX())/20;
    PlayerBlack.B[r][c].rb= r;
     PlayerBlack.B[r][c].cb= c;
     Component s=(Component)e.getSource();
    Component[] cL= ChessBoardGame.b.getComponents();
     if(s instanceof Black){
      for(int i=0; i<cL.length; i++) {
       if(s==cL[i])
      ChessBoardGame.b.remove(cL[i]);
      System.out.print(r);
     }
    }
     ChessBoardGame.b.revalidate();
    ChessBoardGame.b.repaint();
    }
  public void mouseClicked(MouseEvent e) {}
 public void mouseEntered(MouseEvent e) {}
 public void mouseReleased(MouseEvent e) {}
 public void mouseExited(MouseEvent e) {}
}