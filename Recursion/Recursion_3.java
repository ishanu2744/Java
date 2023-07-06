package Recursion;
import java.util.Scanner;

public class Recursion_3 {
    public static void str_reverse(String str,int ind){
        if(ind==0){
            System.out.print(str.charAt(ind));
        }
        else{
            System.out.print(str.charAt(ind));
            str_reverse(str,ind-1);
        }
    }
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        str=sc.nextLine();
        str_reverse(str,str.length()-1);
    }
}
