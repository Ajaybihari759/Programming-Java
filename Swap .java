          //Swap of two number
import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        System.out.println("Enter your value");
        int a,b,temp;  //temp---->Temperary
        Scanner ob=new Scanner(System.in);
        a= ob.nextInt();
        b= ob.nextInt();
        System.out.println("Before Swipping: " + a + " " + b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swipping: " + a + " " + b);
    }
}
