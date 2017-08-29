package study.jdk;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Created by lizhupeng on 2017/8/19.
 */
public class BigDecimalTran {



    public static void main(String[] args) {

        BigDecimal bd = new BigDecimal("5.0E-3");
        String str = bd.toPlainString();
        float f1 = Float.parseFloat(str);
        double a = Double.parseDouble(str);
        BigDecimal bd1 = BigDecimal.valueOf(0.005);
        System.out.println(f1);
        System.out.println(str);
        System.out.println(a);
        System.out.println(bd1);
        DecimalFormat df = new DecimalFormat("###0.0#");
        String ddd = df.format(0.005);
        System.out.println("ddd"+ddd);
    }


}
