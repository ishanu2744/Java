package Pattern;
import java.util.*;

public class Pattern_1 {
    public static void main(String[] args) {
        int row,col;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Rows and Columns: ");
        row= sc.nextInt();
        col= sc.nextInt();
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
