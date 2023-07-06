package Java_Advance;

interface Demo{
    void fun1();
    void fun2();
}
//class AnnonyDemo implements Demo{
//    @Override
//    public void fun1() {
//        System.out.println("This is Anonymous method 1");
//    }
//
//    @Override
//    public void fun2() {
//        System.out.println("This is Anonymous method 2");
//    }
//}
public class Anonymous_Class {
    public static void main(String[] args) {
//        Demo obj=new AnnonyDemo();
        Demo d1=new Demo() {
            @Override
            public void fun1() {
                System.out.println("This is Anonymous method 1");
            }

            @Override
            public void fun2() {
                System.out.println("This is Anonymous method 2");
            }
        };
        d1.fun1();
        d1.fun2();
//        obj.fun1();
//        obj.fun2();
    }
}
