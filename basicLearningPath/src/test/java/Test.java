import java.io.UnsupportedEncodingException;

/**
 * Created by lizhupeng on 2017/4/11.
 */
public class Test {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String v1 = "名";
        System.out.println(v1.getBytes("UTF-8").length);
        System.out.println(v1.getBytes("GBK").length);
        System.out.println(v1.getBytes("GB2312").length);
        System.out.println(v1.getBytes("ASCII").length);
        System.out.println(v1.getBytes("ISO-8859-1").length);
    }
}
