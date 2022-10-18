import java.util.Scanner;
public class Tax {
    public static void main(String[] args) {
        System.out.println("Enter your monthly Salary");
        int a;double b;
        Scanner ob = new Scanner(System.in);
        a = ob.nextInt();

        if(a<=10000){
            System.out.println(a + " No tax");
        }
         else if (a>10000 && a<=10000){
             b=a*0.10;
            System.out.println(a+" of tax "+b);
        }
         else{
            b=a*0.20;
            System.out.println(a+" of tax "+b);
        }
    }
}
