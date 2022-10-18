import java.util.Scanner;
class Star {
  
    public static void main(String[] args) {
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter any number");
      
        int a = ob.nextInt();
        for (int i=1; i<=a; i++){
          for (int j = 1; j <=i ; j++) {

             System.out.print("*");
            }
             System.out.println();
        }
    }
}
