package Java_Advance;

import java.time.LocalDate;

public class Local_DateTime {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        System.out.println(date);
        LocalDate d=LocalDate.of(2023,06,27);
        System.out.println(d);
    }
}
