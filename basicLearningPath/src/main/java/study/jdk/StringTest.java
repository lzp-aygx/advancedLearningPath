package study.jdk;

/**
 * Created by lizhupeng on 2017/4/27.
 */
public class StringTest {
    public static void main(String[] args) {
        //Strings are constant; their values cannot be changed after they are created
        String str1 = "string";//将"string"存放在常量池中并且str1指向常量池.
        String str2 = "string";//由于string 已经存在于常量池中, 所以str2会直接指向常量池中"string"的地址,也是str1的地址
        String str3 = new String("string");//创建新的对象存在于堆中
        String str4 = new String("string");
        Integer int1 = 1;

        //"=="对比的是地址,
        System.out.println(str1 == str2);
        System.out.println(str3 == str4);
        System.out.println(str1 == str3);
        System.out.println(str3.equals(str4));//在普通对象中equals对比的也是地址,但是String,Integer,Double 等类将其进行了重写,修改为对比值

        //因此String每做一次修改就会
        //StringBuilder和StringBuffer的作用基本一样,其中StringBuffer是线程安全的适用于多线程,StringBuilder非线程同步的
        StringBuilder sb = new StringBuilder("string builder");
        StringBuffer sf = new StringBuffer("string buffer");

        long start = System.currentTimeMillis();
        for(int i = 0; i < 500000; i++)
        {
            int1 += 1;
//            sb.append(1);
//            str1 = str1.concat("1");
//            System.out.println(str1);
//            str1 += " ";
        }
        long end = System.currentTimeMillis();
        System.out.println("the run time is "+(end -start)+" ms");
        System.out.println(int1);


    }

}
