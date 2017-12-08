import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;

/**
 * Created by lizhupeng on 2017/4/11.
 */
public class Test {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String dateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date(timestamp));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long timestamp = sdf.parse(dateTime).getTime();
        String dateTime = sdf.format(new java.util.Date(timestamp));

    }
}
