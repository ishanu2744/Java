import java.util.Scanner;

public class try_catch {
    public static void main(String[] args) {
       int[] arr=new int[5];
       Scanner sc=new Scanner(System.in);
       try {
           System.out.print("Enter the array range: ");
           int r=new Scanner(System.in).nextInt();
           for (int i = 0; i < r; i++) {
               System.out.print("Enter "+i+ " index value: ");
               arr[i]=sc.nextInt();
           }
           System.out.println();
           for (int i = 0; i < r; i++) {
               System.out.println(arr[i]);
           }
       }
       catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Range is high than array[5] :"+e);
           e.printStackTrace();
       }
    }
}
