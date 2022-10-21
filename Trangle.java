       //Calculate area of Trangle
  import java.lang.Math;      
  import java.util.Scanner;
   class Trangle{
    public static void main(String[]args){
     System.out.println("Enter value for side trangle: ");
      double a,b,c,sp,area;
       Scanner ob = new Scanner(System.in);
        a=ob.nextInt();
        b=ob.nextInt();
       c=ob.nextInt();
      sp=(a+b+c)/2;
     area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
    System.out.println("Area of trangle "+ area);
   }
  }
