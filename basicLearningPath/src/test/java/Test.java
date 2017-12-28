import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lizhupeng on 2017/4/11.
 */
public class Test {

    public static void main(String[] args) throws UnsupportedEncodingException {
        List<String> stringList = new ArrayList<>();
        stringList.add("123");
        stringList.add("1234");
//        System.out.println(stringList.size());
//        System.out.println(stringList.get(0));

        for (int i = 0 ; i< stringList.size();i++){
            System.out.println(stringList.get(i));
        }

    }
}
