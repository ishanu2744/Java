package com;

interface Horn{
    void BlowHorn();
}
interface Break extends Horn{   //Break interface inherit Horn interface
    void PushBreak();
}
class Bike implements Break{     //implement Break into Bike class
    Bike(){
        System.out.println("Welcome!!!!!");
    }
    @Override
    public void BlowHorn() {
        System.out.println("Horn is Blowing...Peee peee peeee");
    }
    @Override
    public void PushBreak() {
        System.out.println("Break is Applied...");
    }
}
class HeroHonda extends Bike{
    HeroHonda(){
        System.out.println("This is Hero Honda Bike....");
    }
}
public class Interface {
    public static void main(String[] args) {
        HeroHonda H1=new HeroHonda();
//      Horn hr=new HeroHonda();   // This is Example of Polymorphism of interface....
//      hr.BlowHorn();
        H1.BlowHorn();
        H1.PushBreak();
    }
}
