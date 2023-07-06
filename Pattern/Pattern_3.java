package Pattern;

import java.util.Scanner;

public class Pattern_3 {
    public static void main(String[] args) {
        int rows;
        System.out.print("Enter the Rows: ");
        Scanner sc=new Scanner(System.in);
        rows= sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
