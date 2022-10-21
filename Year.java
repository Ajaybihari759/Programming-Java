        /*Check leep year or not*/
         //1. Century (100%=0 and 400%=0)--->Leap year
         //2. Yearly (100!%=0 and 4%=0)--->Leap Year
import java.util.Scanner;
public class Year {
    public static void main(String[] args) {
        System.out.println("Enter the year");
        int y;
        Scanner ob=new Scanner(System.in);
        y=ob.nextInt();

        if(y%100==0 && y%400==0 || y%100!=0 && y%4==0){
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not Leap Year");
        }
    }
}
