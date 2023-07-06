package com;
class Base{
    private int x;
    private int y;

    protected void setX(int x) {

        this.x = x;
    }
    protected int getX() {

        return x;
    }
    protected void setY(int y) {

        this.y = y;
    }
    protected int getY() {

        return y;
    }
    protected void show(){

        System.out.println("x,y: "+getX()+getY());
    }
//    Base(){
//
//        System.out.println("I am a Base class Constractor...");
//    }
    Base(int a){

        System.out.println("This is Base Class A: "+a);
    }
}
class Derived extends Base{
    private int x;
    private int y;
    Derived(int a,int b){
        super(a);
        System.out.println("I am Dericved Class B: "+b);
    }
}
public class inheritence {
    public static void main(String[] args) {
        Base obj=new Derived(12,15);
//        Derived d1=new Derived();
//        d1.setX(5);
//        d1.setY(6);
//        d1.show();
    }
}
