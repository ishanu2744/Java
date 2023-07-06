package Collection_FrameWork;

import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr1= new ArrayList<Integer>();
        arr1.add(15);
        arr1.add(12);
        arr1.add(24);
        arr1.add(6);
        arr1.add(78);
        arr1.add(45);
        arr1.set(1,15);
        for (int i = 0; i < arr1.size(); i++) {
            System.out.println(arr1.get(i));
        }
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Array Value: ");
            arr1.add(sc.nextInt());
        }
    }
}
