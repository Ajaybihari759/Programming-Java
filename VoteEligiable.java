import java.util.Scanner;
public class VoteEligiable {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your age");
        int a;
        a = ob.nextInt();
        if(a>18){
            System.out.println("Eligible for vote");
        }
         else {
            System.out.println("Not Eligible for vote");
        }
    }
}
