          // Calculate the Area of Circle
  import java.util.Scanner;
   class Circle{
    public static void main(String[]args){
     System.out.println("Enter Radius of circle: ");
      final double PI=3.14,area;
      int r;
      Scanner ob = new Scanner(System.in);
     r=ob.nextInt();
   area =PI*r*r;
  System.out.println("Area of Circle: "+ area);     
 }
  }
