package Util;
import java.time.LocalDateTime;

import app.Calendar;

public class Util {

    public static LocalDateTime createDate(){
        int day, month, year, hour, minute;
        while (true){
            System.out.println("Day: ");
            var dayInput = Calendar.input.nextLine();
            System.out.println("Month: ");
            var monthInput = Calendar.input.nextLine();
            System.out.println("Year: ");
            var yearInput = Calendar.input.nextLine();
            System.out.println("Hour(24hr): ");
            var hourInput = Calendar.input.nextLine();
            System.out.println("Min: ");
            var minuteInput = Calendar.input.nextLine();
    
            try {
                day = Integer.parseInt(dayInput);
                month = Integer.parseInt(monthInput);
                year = Integer.parseInt(yearInput);
                hour = Integer.parseInt(hourInput);
                minute = Integer.parseInt(minuteInput);
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage()+", please revise what you have typed.");
                continue;
            }
        return LocalDateTime.of(year,month,day,hour,minute);
        }
    }



}
