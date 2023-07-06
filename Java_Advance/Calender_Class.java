package Java_Advance;

import java.util.Calendar;

public class Calender_Class {
    public static void main(String[] args) {
        Calendar cld=Calendar.getInstance();
        System.out.println(cld.getTime());
        System.out.println(cld.get(Calendar.HOUR)+":"+ cld.get(Calendar.MINUTE)+":"+ cld.get(Calendar.SECOND));
    }
}
