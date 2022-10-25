               //ArmStrong number perigram
               //Input 153--------->(1*1*1 + 5*5*5 + 3*3*3 = 153)
 import java.util.Scanner;
 class ArmStrong{
  public static void main(String [] args){
   System.out.println("Enter any number");
    int n,arm=0,c,rem;
     Scanner ob = new Scanner(System.in);
     n = ob.nextInt();
      c=n;
    while(n>0){
   rem = n%10;
  arm=(rem*rem*rem)+arm;
 n=n/10;
  }
   if(c==arm){
    System.out.println("Armstrong number");
     }
      else{
       System.out.println("Not Armstrong number");
      }
     }
    }
