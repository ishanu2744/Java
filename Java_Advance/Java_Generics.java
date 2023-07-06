package Java_Advance;

import java.util.ArrayList;

class MyGen<T1,T2>{
    private T1 a;
    private T1 b;
    private T2 c;

    public MyGen(T1 a, T1 b, T2 c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T1 getA() {
        return a;
    }
    public T1 getB() {
        return b;
    }
    public T2 getC() {
        return c;
    }
}
public class Java_Generics {
    public static void main(String[] args) {
//        ArrayList arrayList=new ArrayList<>();
//        arrayList.add("String");
//        arrayList.add(25);
//        arrayList.add("abcd");
//        arrayList.add(21);
//        String val=(String)arrayList.get(2);
//        System.out.println(val);

        MyGen<String,Integer> obj=new MyGen<>("This","is",12);
        System.out.println(obj.getA()+" "+obj.getB()+":"+obj.getC());
    }
}
