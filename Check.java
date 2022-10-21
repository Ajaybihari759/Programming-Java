//Check number is positive or negative
    //input n>0 --->Positive
    //input n<0 --->Negative
    //input n=0 ---> neither Negative nor Positive
 import java.util.Scanner;
 public class Check {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        int n;
        Scanner ob=new Scanner(System.in);
        n=ob.nextInt();

        if(n>0){
            System.out.println("Positive Number");
        }
        else if (n<0){
            System.out.println("Negative Number");
        }
        else{
            System.out.println("neither Negative nor Positive");
        }
    }
}
