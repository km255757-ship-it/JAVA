import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ChessBoard2 extends JPanel {
   Color[][] grid= new Color[8][8];
   public ChessBoard2() {
    this.setLayout(null);
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
    }
  public void paintComponent(Graphics g) {
   super.paintComponent(g);
     for(int r=0; r<8; r++) {
      for(int c=0; c<8; c++) {

   g.setColor(grid[r][c]);
   g.fillRect(r*20, c*20, getWidth(), getHeight());
   }
  }
 }
 }