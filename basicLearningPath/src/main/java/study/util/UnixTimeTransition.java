package study.util;

import java.text.SimpleDateFormat;

/**
 * Created by lizhupeng on 2016/11/30.
 */
public class UnixTimeTransition {
    public static void main(String[] args) {
        Long timestamp = Long.parseLong("1481072457918");
        String dateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date(timestamp));
        System.out.println(dateTime);
    }
}
