import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ChessBoardGame {
 public static ChessBoard2 b= new ChessBoard2();
 public static ML listener= new ML();
  public static void main(String[] args){
   ChessBoardGame g= new ChessBoardGame();
   JFrame w = new JFrame("CHESSBOARD");
   PlayerBlack.arrangeBlack(b);
    for(int r=0; r<8; r++){
     for(int c=0; c<8; c++) {
      PlayerBlack.B[r][c].addMouseListener(listener);
     }
    }
    w.setContentPane(b);
    w.setSize(175, 195);
    w.setLocation(100, 100);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    w.setVisible(true);
  }
}