package Collection_FrameWork;
import java.util.*;

public class Hashing_2 {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);
        set.add(2);
        System.out.println(set);
        for(int i:set){             //Type1 Iteration..
            System.out.println(i);
        }
        Iterator it= set.iterator();   //Type2 Iteration..
        while (it.hasNext()){
            System.out.println(it.next());
        }
        set.clear();
        System.out.println(set);
    }
}
