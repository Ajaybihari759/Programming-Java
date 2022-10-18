import java.util.Scanner;
public class Gratest {

    public static void main(String [] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter any three no:-");
        int a,b,c;
        a=ob.nextInt();
        b=ob.nextInt();
        c=ob.nextInt();
        if(a>b){
        
            if(a>c){
            System.out.println(a+": Is Greater No");
            }
            
            else{
            System.out.println(b+": Is Greater No");
            }
          }
          
              else{
              if(b>c){
              System.out.println(b+": Is Greater No");
            }
            else{
            System.out.println(c+": Is Greater No");
            
            }
        }
    }
}
