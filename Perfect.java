      //Check Perfect number program
      //Input 6-----> 1+2+3=6

import java.util.Scanner;
class Perfect {
 public static void main(String[]args){
 
  Scanner ob=new Scanner(System.in);
  int n,sum=0;
  System.out.println("Enter your number");
  n=ob.nextInt();
  
  for(int i=1; i<n; i++){
    if(n%i==0){
    sum=sum+i;
    }
  }
  
  if(n==sum)
    System.out.println(sum+" is Perfect number");
  
  else
   System.out.println("Not Perfect number");
  
 }
}
