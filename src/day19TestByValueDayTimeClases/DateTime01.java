package day19TestByValueDayTimeClases;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;

public class DateTime01 {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println(date1.getTime());

        //local date
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.now(ZoneId.of("Asia/Tokyo")));
        // How to get future date
        System.out.println(LocalDate.now().plusDays(100));
        System.out.println(LocalDate.now().plusMonths(25));
        System.out.println(LocalDate.now().minusDays(44));
        // also you can use LocalTime
        System.out.println(LocalTime.now());
        System.out.println(LocalTime.now().getHour());
        System.out.println(LocalTime.now().getMinute());
        System.out.println(LocalDate.now().getDayOfWeek());
        System.out.println(LocalDate.now().getYear());
        System.out.println(LocalTime.now().isAfter(LocalTime.of(18,22,35)));
        

    }
}
