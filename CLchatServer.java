import java.net.*;
import java.io.*;

public class CLchatServer {
 public static final int DEFAULT_PORT= 1728;
  public static void main(String[] args) {
    int port;
    ServerSocket listener;
    socket connection;
    BufferedReader incoming;
    PrintWriter outgoing;
    String messageOut;
    String messageIn;
    BufferedReader userInput;
   if( args.length== 0)
     port= DEFAULT_PORT;
    else{
     try{
     port= Integer.parseInt(args[0]);
      if(port<0 || port> 65535)
        throw new NumberFormatException();
     }
      catch( NumberFormatException e) {
       System.out.print("error" + e);
        return;
      }
   
    try {
      listener= new ServerSocket(port);
       connection= listener.accept();
       listener.close();
       incoming= new BufferedReader( new InputStreamReader(connection.getInputStream()));
       outgoing= new PrintWriter(Connection.getOutputStream());
        
     }
      catch(Exception e){
       System.out.print(e.toString);
       return;
      }
    try {
     userInput= new BufferedReader( new InputStreamReader(System.in));
     while(true) {
     messageIn= incoming.readLine();
     