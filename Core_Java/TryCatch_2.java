import java.util.Scanner;
class CustomException extends Exception{
    @Override
    public String toString() {
        return "Invalid index!!!";
    }
}
public class TryCatch_2 {
    public static void main(String[] args) {
        int array[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 5 array elements: ");
        for (int i = 0; i < 5; i++) {
            array[i]= sc.nextInt();
        }
        System.out.print("Enter a valid index : ");
        int ind= sc.nextInt();
        if (ind >4){
            try {
                throw new CustomException();
            } catch (CustomException e) {
                System.out.println(e.toString());
            }
        }
        else{
            System.out.println("Value of the index: "+array[ind]);
        }
    }
}
