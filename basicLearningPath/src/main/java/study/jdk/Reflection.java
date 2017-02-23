package study.jdk;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by lizhupeng on 2016/8/3.
 */

/**
 * 反射机制是在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法；对于任意一个对象，都能够调用它的任意一个方法和属性；
 * 这种动态获取的信息以及动态调用对象的方法的功能称为java语言的反射机制
 */
public class Reflection {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        User user = new User(1, "2", "3");
        Class clazz = user.getClass();
        /**通过反射机制来实例化,并且调用对象方法*/
        Object ob = clazz.newInstance();//如果需要实例化一个对象,该类型中就必须要有一个公共的无参构造函数
        Method method = clazz.getMethod("setId", long.class);//方法名,后面就是参数是对应方法的参数类型
        method.invoke(ob, 8);//根据方法的传入参数类型来调用方法
        /**获取反射类型的名称,全部方法和属性*/
        String className = clazz.getName();
        /**有两个方法:
         *  getDeclaredMethods:到该类所有的方法，不包括父类的
         *  getMethods:得到该类所有的public方法，包括父类的*/
        Method[] methods = clazz.getDeclaredMethods();
        /**有两个方法:
         *  getDeclaredFields:到该类所有的属性，不包括父类的
         *  getFields:得到该类所有的public属性，包括父类的*/
        Field[] fields = clazz.getDeclaredFields();
        System.out.println("className: " + className);
        for (Method met : methods) {
            System.out.println("method: " + met.getName());
        }
        for (Field fie : fields) {
            System.out.println("field: " + fie.getName());
        }

        /**使用非无参构造函数来实例化*/
        Constructor constructor = clazz.getDeclaredConstructor(long.class,String.class,String.class);
        Object ob1 = constructor.newInstance(9,"lizhupeng","lizhupeng");
        for (Method met : methods) {
            if("toString".equals(met.getName()))
            System.out.println(met.invoke(ob1));
            System.out.println(met.getName());
        }


    }
}
