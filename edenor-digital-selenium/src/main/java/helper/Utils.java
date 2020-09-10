package helper;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.lang.Integer;

public class Utils {

    //public static String stringPlusOne(String numberString){
       // return (Integer.parseInt(numberString) + 1).toString();
   // }

    public String getTimeStamp(String format){
        Calendar calendar = Calendar.getInstance();
        //KeywordUtil.logInfo(">>> Getting time: " + calendar.getTime());
        SimpleDateFormat omsFormat = new SimpleDateFormat(format);
        String formatted = omsFormat.format(calendar.getTime());
        //KeywordUtil.logInfo(">>> Formating time for entry: " + formatted);
        return formatted;
    }

    //public String static String getTimeStamp(){
        //Calendar calendar = Calendar.getInstance();
        //KeywordUtil.logInfo(">>> Getting time: " + calendar.getTime());
        //SimpleDateFormat omsFormat = new SimpleDateFormat();

        //return calendar.getTimeInMillis().toString();
    //}

    public static int randomInt(int min, int max){
        return (int) ((Math.random() * ((max - min) + 1)) + min);
    }

}
