package Java_Advance;

import java.util.Date;

public class Date_Class {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
    }
}
