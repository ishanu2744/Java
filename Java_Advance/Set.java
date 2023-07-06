package Java_Advance;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {        //Program for duplicate element
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set);
    }
}
