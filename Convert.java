         //Convert Character Uppercase to Lowercase
import java.util.Scanner;
public class Convert {
    public static void main(String[] args) {
        System.out.println(" Enter your character: ");
        char ch,ch2;
        Scanner ob=new Scanner(System.in);
        ch=ob.next().charAt(0);
        if(ch>='A' && ch<='Z') {
            ch2 = Character.toLowerCase(ch);
            System.out.println(" Lowercase: " + ch2);
        }
        else{
            ch2 = Character.toUpperCase(ch);
            System.out.println(" Uppercase: " + ch2);
        }
    }
}
