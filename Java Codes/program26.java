
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.LocalDateTime;

public class program26 {
    public static void main(String args[]){
    
        //Date and Time in java
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println("\n");
        LocalDate obj1 = LocalDate.now();
        System.out.println(obj1);
        System.out.println("\n");
        Month month = obj1.getMonth();
        System.out.println(month);
        System.out.println("\n");
        int dayofyear=obj1.getDayOfYear();
        System.out.println(dayofyear);
        System.out.println("\n");
        int day = obj1.getDayOfMonth();
        System.out.println(day);
        System.out.println("\n");
        int year = obj1.getYear();
        System.out.println(year);
        System.out.println("\n");

        //LocalTime Class in Java
        LocalTime obj2 = LocalTime.now();
        System.out.println(obj2);
        System.out.println("\n");

        //LocalDateTime Class in Java

        LocalDateTime obj3 = LocalDateTime.now();
        System.out.println(obj3);
        System.out.println("\n");
        int day1 = obj3.getDayOfMonth();
        System.out.println(day1);
        System.out.println("\n");
        Month month1 = obj3.getMonth();
        System.out.println(month1);
        System.out.println("\n");
        int year1 = obj3.getYear();
        System.out.println(year1);
        System.out.println("\n");
        int hour = obj3.getHour();
        System.out.println(hour);
        System.out.println("\n");
        int minute = obj3.getMinute();
        System.out.println(minute);
        System.out.println("\n");
        int second = obj3.getSecond();
        System.out.println(second);
        System.out.println("\n");
        
        //GregorianCalendar Class in Java
        GregorianCalendar obj4 = new GregorianCalendar();
        System.out.println(obj4.getTime());
        System.out.println("\n");
        int year2 = obj4.get(Calendar.YEAR);
        System.out.println(year2);
        System.out.println("\n");
        int month2 = obj4.get(Calendar.MONTH);
        System.out.println(month2);
        System.out.println("\n");
        int day2 = obj4.get(Calendar.DAY_OF_MONTH);
        System.out.println(day2);
        System.out.println("\n");
        int hour1 = obj4.get(Calendar.HOUR);
        System.out.println(hour1);
        System.out.println("\n");
        int minute1 = obj4.get(Calendar.MINUTE);
        System.out.println(minute1);
        System.out.println("\n");
        int second1 = obj4.get(Calendar.SECOND);
        System.out.println(second1);
        System.out.println("\n");
        int day3 = obj4.get(Calendar.DAY_OF_YEAR);
        System.out.println(day3);
        System.out.println("\n");
        int day4 = obj4.get(Calendar.DAY_OF_WEEK);
        System.out.println(day4);
        System.out.println("\n");
        int day5 = obj4.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        System.out.println(day5);
    }
}
