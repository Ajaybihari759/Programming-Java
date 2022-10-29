        //Array in java
import java.util.Scanner;
 class Array{
  public static void main(String [] args){
  
  Scanner ob=new Scanner(System.in);
  int size,i;
  System.out.print("Enter your Array size: ");
  
  size = ob.nextInt();
  int a[] = new int [size];
  
  for(i=0; i<size; i++){
    a[i] = ob.nextInt();
    }
    System.out.print("Printed Array elements: ");
    
  for(i=0; i<size; i++){
   System.out.print(a[i]+" ");
    }
   }
  }
 
