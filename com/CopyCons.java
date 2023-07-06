package com;
class Simple{
    int x,y;
    Simple(){
        x=1;
        y=2;
        System.out.println("This is Default Cons x:"+x+" y:"+y);
    }
    Simple(int a,int b){
        x=a;
        y=b;
        System.out.println("This is Parameterised Cons x:"+x+" y:"+y);
    }
    Simple(Simple s1){ //Receiving the class type object...
        x= s1.x; // Setting the values...
        y=s1.y;
        System.out.println("This is Copy Cons x:"+x+" y:"+y);
    }

}
public class CopyCons {
    public static void main(String[] args) {
    Simple S1=new Simple();
    Simple S2=new Simple(4,5);
    Simple S3=new Simple(S1);// Pass a object as a parameter....(for example S1)
    }
}
