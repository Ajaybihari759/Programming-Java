       //Reverse number program
          //input number 123------>321
       
import java.util.Scanner;
  class Reverse{
   public static void main(String [] args){
    System.out.print("Enter your number");
    int a,r;
    Scanner ob=new Scanner(System.in);
    a=ob.nextInt();
    
    while(a>0){
      r=a%10;
    System.out.print(r                              );
      a=a/10;
    }
   }
  }
