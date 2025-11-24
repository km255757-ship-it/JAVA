public class Factorial {
 static int factorial(int N) {
   int value;
   if (N==0){
    value = 1;
    return value;
   }
   else if (N>0) {
    value= N*factorial(N-1);
     return value;
   }
   else
    return 0;
  }
  static int fibonacci(int N) {
   int value;
   if(N==0)
    return 0;
   else if(N==1)
   return 1;
  else if (N>1) {
   value= fibonacci(N-1)+ fibonacci(N-2);
   return value;
  }
  else 
   return 0;
 }
  public static void main(String [] args) {
   System.out.println(factorial(1));
   System.out.print(fibonacci(3));
  }
}