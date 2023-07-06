package Pattern;

import java.util.Scanner;

public class Pattern_7 {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the Rows: ");
        Scanner sc=new Scanner(System.in);
        n = sc.nextInt();
        for (int i = n; i >0; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
