       //Enter the code of day and print the name of day
       // input code:- 0 to 6
   
  import java.util.Scanner;
  class Weekend{
    public static void main(String[]args){
    System.out.print("Enter your code: ");
    int a;
    Scanner ob = new Scanner(System.in);
    a = ob.nextInt();
    
    switch(a){
     case 0: System.out.println("Sunday");
     break;
     
      case 1: System.out.println("Monday");
     break;
     
      case 2: System.out.println("Tuesday");
     break;
     
      case 3: System.out.println("Wednesday");
     break;
     
      case 4: System.out.println("Thrusday");
     break;
     
      case 5: System.out.println("Friday");
     break;
     
      case 6: System.out.println("Saturday");
     break;
     }
    }
  }      
