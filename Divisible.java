          //Check the number of divisible by 5 or not
           // Input 10---> Divisible by 5
           // Inout 12---> Not Divisible by 5
  import java.util.Scanner;
   class Divisible{
     public static void main(String[]args){
     System.out.print(" Enter the any number: ");
     int a;
     Scanner ob=new Scanner(System.in);
     a=ob.nextInt();
     
     if(a%5==0){
     System.out.println("It is dividible by 5");
     }
      else{
      System.out.println("Not Divisible by 5");
      }
     }
   }
