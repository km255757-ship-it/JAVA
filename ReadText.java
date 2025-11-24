import java.io.*;
import java.util.*;
public class ReadText {
 public static void main(String[] args) {
  
  
     Scanner in= new Scanner(System.in);
    String line = in.nextLine();
     while( line != null && line.length()>0) {
       System.out.println(line);
        line= in.nextLine();
     }
 
 }
}