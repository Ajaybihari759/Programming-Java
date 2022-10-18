 import java.util.Scanner;
  class Addevenodd{
   public static void main(String [] args){
    Scanner ob = new Scanner(System.in);
     System.out.println("Enter your no:");  
      int a=ob.nextInt();
       int b=0;
       if(a%2==0){
      for(int i=0; i<=a; i=i+2){
     b=i+b;
    }
   System.out.println("It's Even no: "+b);
  } 
 else{
 for(int i=1; i<=a; i=i+2){
  b=i+b;
   }
    System.out.println("It's Odd no:"+b);
     }
      }
       }   
