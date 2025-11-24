import java.io.*;
public class InputFile {
 public static void main(String[] args) {
  PrintWriter out;
  try {
  out= new PrintWriter(new FileWriter("kgm.txt"));
  if(!out.checkError())
 out.print("KGM");
  }
  catch(Exception e) {
  System.out.print( e);
  }
  }
}