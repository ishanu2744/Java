package Recursion;

import java.util.Scanner;

public class Recursion_2 {
    static public int fact(int n){
        if(n==1){
            return 1;
        }
        else {
             int fact=n*fact(n-1);
             return fact;
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        n= sc.nextInt();
        int fact=fact(n);
        System.out.println("Factorial of "+n+" is: "+fact);
    }
}
