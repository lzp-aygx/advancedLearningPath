package study.jdk;

import java.math.BigDecimal;

/**
 * Created by lizhupeng on 2017/4/11.
 */
public class BigDecimalTest {

    public static void main(String[] args)   {
        BigDecimal b1 =new BigDecimal("0.005");
        BigDecimal b2 =new BigDecimal("0.01");
        BigDecimal b3=b1.divide(b2);
//        b3.doubleValue();
        System.out.println(b3);
        System.out.println(b2.compareTo(b1));

    }
}
