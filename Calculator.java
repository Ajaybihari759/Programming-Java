import java.util.Scanner;
   class Calculator{
     public static void main(String [] args){
       System.out.print("Enter two no: ");
         int n1,n2,ch,cal;
           Scanner ob = new Scanner(System.in);
           n1=ob.nextInt();
           n2=ob.nextInt();
         System.out.print("Enter your choise ");
       ch=ob.nextInt(); 
     if(ch==1){
   cal=n1+n2;
 System.out.println("ADDITION: "+ cal);
   }
     else if(ch==2){
       cal=n1-n2;
         System.out.println("SUBTRACTION: "+ cal);
           }
            else if(ch==3){
            cal=n1*n2;
          System.out.println("MULTIPLICATION: "+ cal);
        }
     else if(ch==4){
    cal=n1/n2;
  System.out.println("DIVISION: "+ cal);
}
  else{
    cal=n1%n2;
      System.out.println("REMINDER: "+ cal);    
        }
      }     
    }
