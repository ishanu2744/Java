package com;
import java.util.Random;
public class Random_Number {
    public static void main(String[] args) {
        Random rad= new Random();
        int c=10;
        while (c>0){
            int num=20+rad.nextInt(30);
            System.out.println(num);
            c--;
        }
    }
}
