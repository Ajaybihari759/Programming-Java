                       //Check prime number or not
                       //Input 5---------> Prime number
                    
import java.util.Scanner;
 class Prime{
  public static void main(String[]args){
  
  Scanner ob=new Scanner(System.in);
  System.out.println("Enter your number");
  int n=ob.nextInt();
  int count=0;
  for(int i=1; i<=n; i++){
    if(n%i==0){
    count ++;
    }
  }
  
   if(count==2){
   System.out.println("Prime number");
   }
   
   else{
   System.out.println("Not prime number");
   }
  }
 }
