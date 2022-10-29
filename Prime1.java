             //Check prime b/w two number
              //Input 1st number 10
              //Input 2nd number 20---------> 11 13 17 19
              
 import java.util.Scanner;
  class Prime1{
   public static void main(String[]args){
   
   Scanner ob=new Scanner(System.in);
   int n1,n2,i,j;
   System.out.println("Input any two number: ");
   n1=ob.nextInt();
   n2=ob.nextInt();
   
    for( i=n1; i<=n2; i++){
      for( j=2; j<=i; j++){
       if(i%j==0)
       break;
      }
      if(i==j)
      System.out.print(j+"  ");
    }
   }
  }
