package com;
class Base2{
    Base2(int x){
        System.out.println("This is Base class X : "+x);
    }
}
class Derived2 extends Base2{
    Derived2(int x,int y){
        super(x);
        System.out.println("This is Derived2 Class Y: "+y);
    }
}
class Derived3 extends Derived2{
    Derived3(int x,int y,int z){
        super(x,y);
        System.out.println("This is Derived3 Class Z: "+z);
    }
}
public class inheritence2 {
    public static void main(String[] args) {
//        Derived2 d1=new Derived2(12,15);
        Derived3 d2=new Derived3(4,5,6);
    }
}
