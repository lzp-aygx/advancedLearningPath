package study.util;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lizhupeng on 2016/11/30.
 */
public class UnixTimeTransition {
    public static void main(String[] args) throws ParseException {
//        Long timestamp = Long.parseLong("1481072457918");
//        String dateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date(timestamp));
//        System.out.println(dateTime);

        String startDate = "2016-01-01 00:00:00";
        String endData = "2016-12-31 00:00:00";
        System.out.println(difBetweenDate(startDate,endData));
        Date now = new Date();
        System.out.println(now);

    }

    public static Long difBetweenDate(String startDate, String endData) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long startUnix = sdf.parse(startDate).getTime();
        long endUnix = sdf.parse(endData).getTime();
        return  (endUnix-startUnix)/1000/60/60/24;
    }
}
