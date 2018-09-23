package playmzubair.com.dateutils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by adeeb on 9/23/2018.
 */

public class DateConverter {
    public static String dateFormatDDMMYY="dd/MM/yyyy";



    public static Date getDate(String dateStr){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(dateFormatDDMMYY, Locale.getDefault());
      //  simpleDateFormat.setLenient(false);
        try {
            return  simpleDateFormat.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static boolean isDatePass(Date date){
        Date today=Calendar.getInstance().getTime();

        return today.after(date);
    }

    public static boolean isWeekPass(Date lastDate){
        Calendar calendarToday=Calendar.getInstance();

        Calendar calendarLast=Calendar.getInstance();
        calendarLast.setTime(lastDate);

       int lastWeek= calendarLast.get(Calendar.WEEK_OF_MONTH);
       int currenteek=calendarToday.get(Calendar.WEEK_OF_MONTH);



        return lastWeek<currenteek;
    }


    public Date getTodayDate(){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(dateFormatDDMMYY);

        Calendar calendar=Calendar.getInstance();

        return Calendar.getInstance().getTime();
    }


    public long getTodayDateMilis(){
        return Calendar.getInstance().getTimeInMillis();
    }


}
