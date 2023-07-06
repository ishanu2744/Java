package Collection_FrameWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HashMap_Prac {
    public static void MajorElement(ArrayList<Integer> list){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (map.containsKey(list.get(i))){
                map.put(list.get(i), map.get(list.get(i))+1 );
            }
            else {
                map.put(list.get(i),1);
            }
        }
        System.out.println(map);
        for (int key: map.keySet()){
            if (map.get(key)> list.size()/3){
                System.out.println(key);
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the ArrayList:- ");
        int n= sc.nextInt();
        System.out.print("Enter the Elements:- ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        MajorElement(list);
    }
}
