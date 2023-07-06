package Collection_FrameWork;

import java.util.HashMap;
import java.util.Map;

public class Hashing_1 {
    public static void main(String[] args) {
        HashMap<String,Integer> map1 =new HashMap<>();
        map1.put("Student_1",100);
        map1.put("Student_2",101);
        map1.put("Student_3",102);
        map1.put("Student_4",103);
        for (String key: map1.keySet()) {                 //Type1 Traversing..
            System.out.println(key+":-"+ map1.get(key));
        }
        System.out.println();
        for (Map.Entry<String,Integer> e: map1.entrySet()){      //Type2 Traversing..
            System.out.println(e.getKey()+" "+e.getValue());
        }
        map1.remove("Student_4",103);
        System.out.println(map1);
    }
}
