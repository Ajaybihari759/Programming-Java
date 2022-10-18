import java.util.Scanner;
public class CountDigitNumber {
  
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
            System.out.println("Enter the number");
                int a,b=0;
                    a = ob.nextInt(); 
                         while (a>0){
                              a=a/10;
                                  b++;
                                      }
                                         System.out.println("Total no:"+b);
                                      }
                                     }
