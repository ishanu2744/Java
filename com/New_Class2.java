package com;
import java.util.Random;
class Rectangle{
    private int length;
    private int breath;

    public void setLength(int length) {
        this.length = length;
    }
    public int getLength() {
        return length;
    }
    public void setBreath(int breath) {
        this.breath = breath;
    }
    public int getBreath() {
        return breath;
    }
    public int Area(){
        int area=getLength()*getBreath();
        return area;
    }
    public int Perimeter(){
        int perimeter=2*(getLength()+getBreath());
        return perimeter;
    }
    public void display(){
        System.out.println("The Area of the Rectangle is: "+ Area());
        System.out.println("The Perimeter of the Rectangle is: "+ Perimeter());
        System.out.println();
    }
}

public class New_Class2 {
    public static void main(String[] args) {
    Random num= new Random();
    int len,br;
    Rectangle [] arr= new Rectangle[5];
    for (int i=0;i<5;i++){
        arr[i]= new Rectangle();
    }
    for (int i=0;i<5;i++){
        len= 5+ num.nextInt(10);
        br= 1+num.nextInt(6);
        arr[i].setLength(len);
        arr[i].setBreath(br);
    }
    for (int i=0;i<5;i++){
        arr[i].display();
        }
    }
}
