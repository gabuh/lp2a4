package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
    public static Date stringToDate(String date) {
        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat dateFormatHip = new SimpleDateFormat("dd-MM-yyyy");
            if (date.contains("/"))
                return dateFormat.parse(date);
            return dateFormatHip.parse(date);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return new Date();
    }

}
