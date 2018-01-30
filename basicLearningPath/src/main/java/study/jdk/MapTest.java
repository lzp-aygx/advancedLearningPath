package study.jdk;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lizhupeng
 * @date 2018/01/26
 */
public class MapTest {



    public static void main(String[] args) {

        String key1 = "001";
        String key2 = "001";
        System.out.println(key1.hashCode() == key2.hashCode());
        Map testMap = new HashMap<>();
        testMap.put(key1,"002");
        testMap.put(key2,"003");
        testMap.put(null,"004");

        System.out.println(testMap.size());
        System.out.println(testMap.get("001"));
        System.out.println(testMap.get(null));
    }
}
