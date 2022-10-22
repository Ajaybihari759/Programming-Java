                  //Sum of digit number
                  //  input 1234------>(1+2+3+4=10)
 import java.util.Scanner;
   class SumDigit{
   public static void main(String [] args){
     System.out.println("Enter your number: ");
     int a,r,sum=0;
     Scanner ob=new Scanner(System.in);
     a=ob.nextInt();
     
     while(a>0){
        r=a%10;
        sum=sum+r;
        a=a/10;
     }
     System.out.println("Sum of Digit: " + sum);
   }
  }                   
