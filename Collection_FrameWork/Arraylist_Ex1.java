package Collection_FrameWork;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist_Ex1 {
    public static void main(String[] args) {
        ArrayList<String> arr1=new ArrayList<>();
        for (int i = 0; i <3; i++) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter "+i+" name: ");
            String name= sc.next();
            arr1.add(name);
        }
        for (String val:arr1) {
            System.out.println(val);
        }
    }
}
