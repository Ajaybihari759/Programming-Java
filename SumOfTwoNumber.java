/*
Enter first number : 
54
Enter second number : 
65
Result 119


*/



package Ajay;

import java.util.Scanner;

public class AddTwoNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int n1 = scan.nextInt();
        System.out.println("Enter second number : ");
        int n2 = scan.nextInt();
        int res = n1+n2;
        System.out.println("Result " + res);
    }
}



