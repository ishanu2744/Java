package Pattern;

import java.util.Scanner;

public class Pattern_8 {
    public static void main(String[] args) {
        int n,count=1;
        System.out.print("Enter the Rows: ");
        Scanner sc=new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
