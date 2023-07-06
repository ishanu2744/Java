package Recursion;

public class Recursion_1 {
    public static void PrintNum1(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        PrintNum1(n-1);
    }
    public static void PrintNum2(int n,int a){
        if(n==0){
            return;
        }
        System.out.print(a+" ");
        PrintNum2(n-1,a+1);
    }

    public static void main(String[] args) {
        int n=5,count=1;
        PrintNum1(n);
        System.out.println();
        PrintNum2(n,count);
    }
}
