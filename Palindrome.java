         // Check Palindrome number or not
             // Input 121------>121
  
  import java.util.Scanner;
   class Palindrome{
    public static void main(String [] args){
     System.out.print("Enter your number");
      int n,s=0,r,c;
       Scanner ob=new Scanner(System.in);
       n=ob.nextInt();
      c=n;
     while(n>0){
    r=n%10;
   s=(s*10)+r;
  n=n/10;
 }
 if(c==s){
  System.out.println("Palindrome Number");
   }
    else{
     System.out.println("Not Palindrome Number");
     }     
      }
       }           
