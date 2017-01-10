package study.jdk;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by lizhupeng on 2016/8/3.
 */
/*反射机制是在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法；对于任意一个对象，都能够调用它的任意一个方法和属性；
  这种动态获取的信息以及动态调用对象的方法的功能称为java语言的反射机制*/
public class Reflection {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        User user = new User(1,"2","3");
        Class clazz = user.getClass();
        String className = clazz.getName();
        Method[] methods = clazz.getDeclaredMethods();
        Field[] fields =clazz.getDeclaredFields();
        System.out.println("className: " + className);
        for(Method met : methods){
            System.out.println(met);
        }
        for(Field fie : fields){
            System.out.println(fie);
        }
    }
}
